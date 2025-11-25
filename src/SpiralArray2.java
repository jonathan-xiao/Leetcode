public static void main(String[] args) {
    System.out.println(spiralArray(generateArray(1)));
    System.out.println(spiralArray(generateArray(20)));

}

public static int[][] generateArray(int n) {
    int rows = n;
    int cols = n;
    int[][] result = new int[rows][cols];
    int h = 0;
    int v = 0;
    int seen = 1;
    while (seen <= rows*cols) {
        for (int i = v; i < cols-v; i++) {
            result[h][i] = seen;
            seen++;
        }
        if (seen == rows*cols+1) break;
        for (int j = h+1; j < rows-h; j++) {
            result[j][cols-v-1] = seen;
            seen++;
        }
        if (seen == rows*cols+1) break;
        for (int i = cols - v - 2; i >= v; i--) {
            result[rows-h-1][i] = seen;
            seen++;
        }
        if (seen == rows*cols+1) break;
        for (int j = rows - h - 2; j >= h+1; j--) {
            result[j][v] = seen;
            seen++;
        }
        v++;
        h++;
    }
    return result;
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