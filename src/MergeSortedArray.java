public static void main(String[] args) {
    int[] test = {1, 3, 5};
    int[] test1 = {2, 8, 0, 0, 0};
    int[] base = {};
    int[] base1 = {0};
    merge(test1, 2, test, 3);
    merge(base, 0, base, 0);
    merge(base1, 1, base, 0);
}

public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
    int[] result = new int[m + n];
    int p1 = 0;
    int p2 = 0;
    int pr = 0;
    while (p1 < m && p2 < n) {
        if (nums1[p1] <= nums2[p2]) {
            result[pr] = nums1[p1];
            pr++;
            p1++;
        } else {
            result[pr] = nums2[p2];
            pr++;
            p2++;
        }
    }
    while (p1 < m) {
        result[pr] = nums1[p1];
        pr++;
        p1++;
    }
    while (p2 < n) {
        result[pr] = nums2[p2];
        pr++;
        p2++;
    }
    System.arraycopy(result, 0, nums1, 0, result.length);
    return nums1;
}
