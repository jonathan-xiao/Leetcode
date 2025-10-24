public static void main(String[] args) {
    int[] test = {1, 3, 5};
    int[] h1 = {1,1};
    int[] test1 = {2, 3, 4, 6, 10};
    int[] height = {1,8,6,2,5,4,8,3,7};
    MaxArea(height);
    MaxArea(test);
    MaxArea(h1);
}

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