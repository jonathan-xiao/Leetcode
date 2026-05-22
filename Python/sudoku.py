class Solution(object):
    def sudoku(self, board):
        # idea: use a set for every row, column, and box to verify
        # for boxes, store the (0,0) - (2,2) id of the box to use only one set
        rows = set()
        cols = set()
        boxes = set()
        for i in range(9):
            for j in range(9):
                if board[i][j] in rows:
                    return False
                elif board[i][j] == '.':
                    continue
                else:
                    rows.add(board[i][j])

                id = (i // 3, j // 3)
                if (id, board[i][j]) in boxes:
                    return False
                elif board[i][j] == '.':
                    continue
                else:
                    boxes.add((id, board[i][j]))

            
            rows.clear()

        for i in range(9):
            for j in range(9):
                if board[j][i] in cols:
                    return False
                elif board[j][i] == '.':
                    continue
                else:
                    cols.add(board[j][i])
            
            cols.clear()

        return True
    
    def game(self, board):
        rows = len(board)
        cols = len(board[0])

        def neighbours(r,c):
            # idea: two passes and flags
            # use -1 and 2 to mark switches
            # then resolve on the second pass
            count = 0
            for dr in (-1, 0, 1):
                for dc in (-1, 0, 1):
                    if dr == 0 and dc == 0:
                        continue
                    nr = r + dr
                    nc = c + dc
                    if 0 <= nr < rows and 0 <= nc < cols:
                        if board[nr][nc] == 1 or board[nr][nc] == -1:
                            count += 1
            
            return count
        
        for r in range(rows):
            for c in range(cols):
                nb = neighbours(r, c)
                if board[r][c] == 1 and nb not in (2, 3):
                    board[r][c] = -1
                elif board[r][c] == 0 and nb == 3:
                    board[r][c] = 2 

        for r in range(rows):
            for c in range(cols):
                if board[r][c] == -1:
                    board[r][c] = 0
                elif board[r][c] == 2:
                    board[r][c] = 1
