public static int MaxArea(int[] height) {
    int area = Integer.min(height[0], height[height.length - 1]) * (height.length-1);
    int p = 0;
    int q = height.length-1;
    while (p < q) {
        if ((Integer.min(height[p], height[q]) * (q-p)) >= area) {
            area = (Integer.min(height[p], height[q]) * (q-p));
        }
        if (height[p] > height[q]) {
            q--;
        } else {
            p++;
        }
    }
    System.out.println(area);
    return area;
}

void main() {
}