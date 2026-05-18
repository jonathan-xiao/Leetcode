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