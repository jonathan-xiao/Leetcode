class Solution(object):
    def trail(self, n):
        # idea: legendre's algorithm
        count = 0
        i = 1
        while (pow(5, i) <= n):
            count += (n / pow(5,i))
            i += 1

        return count
    
    def setzero(self, matrix):
        # use the first row and column as flags
        # but make sure not to override them by setting it to 0 too early
        # use booleans for those two lines in particular
        hei = len(matrix)
        wid = len(matrix[0])

        first_row_zero = any(matrix[0][j] == 0 for j in range(wid))
        first_col_zero = any(matrix[i][0] == 0 for i in range(hei))

        for i in range(1,hei):
            for j in range(1,wid):
                if matrix[i][j] == 0:
                    matrix[0][j] = 0
                    matrix[i][0] = 0
        
        for i in range(1,hei):
            if matrix[i][0] == 0:
                for j in range(wid):
                    matrix[i][j] = 0
        
        for j in range(1,wid):
            if matrix[0][j] == 0:
                for i in range(hei):
                    matrix[i][j] = 0

        if first_row_zero:
            matrix[0] = [0] * wid
        if first_col_zero:
            for i in range(hei):
                matrix[i][0] = 0

                
