public class RotateImage {
    public int[][] rotate(int[][] matrix) {
        int length = matrix.length;
        int v = 0;
        int h = 0;
        while (v<length/2) {
            for (int i = 0; i<length-v-h-1; i++) {
                int temp = matrix[v][h+i];
                matrix[v][h+i] = matrix[length-1-v-i][h];
                matrix[length-1-v-i][h] = matrix[length-1-v][length-1-h-i];
                matrix[length-1-v][length-1-h-i] = matrix[i+v][length-1-h];
                matrix[i+v][length-1-h] = temp;

            }
            v++;
            h++;
        }
        return matrix;
    }
}
