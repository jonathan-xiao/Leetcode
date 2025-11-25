public static void main(String[] args) {
    int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
    int[][] m2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    System.out.println(spiralArray(matrix));
    System.out.println(spiralArray(m2));

}

public static List<Integer> spiralArray(int[][] matrix) {
    int rows = matrix.length;
    List<Integer> list = new ArrayList<>();
    if (rows == 0) return list;
    int cols = matrix[0].length;
    int h = 0;
    int v = 0;
    int seen = 0;
    while (seen < rows*cols) {
        for (int i = v; i < cols-v; i++) {
            list.add(matrix[h][i]);
            seen++;
        }
        if (seen == rows*cols) break;
        for (int j = h+1; j < rows-h; j++) {
            list.add(matrix[j][cols-v-1]);
            seen++;
        }
        if (seen == rows*cols) break;
        for (int i = cols - v - 2; i >= v; i--) {
            list.add(matrix[rows-h-1][i]);
            seen++;
        }
        if (seen == rows*cols) break;
        for (int j = rows - h - 2; j >= h+1; j--) {
            list.add(matrix[j][v]);
            seen++;
        }
        v++;
        h++;
    }
    return list;
}