public static void main(String[] args) {
    System.out.println(spiralArray2(1));
    System.out.println(spiralArray2(4));

}

public static int[][] spiralArray2(int n) {
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
        if (seen == rows*cols) break;
        for (int j = h+1; j < rows-h; j++) {
            result[j][cols-v-1] = seen;
            seen++;
        }
        if (seen == rows*cols) break;
        for (int i = cols - v - 2; i >= v; i--) {
            result[rows-h-1][i] = seen;
            seen++;
        }
        if (seen == rows*cols) break;
        for (int j = rows - h - 2; j >= h+1; j--) {
            result[j][v] = seen;
            seen++;
        }
        v++;
        h++;
    }
    return result;
}