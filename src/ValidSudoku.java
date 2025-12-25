import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
               char curr = board[i][j];
               if (curr != '.') {
                   if (!set.add(curr + " row " + i) || !set.add(curr + " col " + j) || !set.add(curr + " subgrid  " + i/3 + "x" + j/3)) {
                       return false;
                   }
               }
            }
        }
        return true;
    }
}
