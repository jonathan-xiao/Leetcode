public static void main(String[] args) {
    int[] test = {1, 2, 3};
    int[] h1 = {1,1,1};
    int[] test1 = {2, 3, 4, 6, 10};
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(findMaxAverage(test, 2));

}
    public static double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            max = nums[i] + max;
        }
        int sum = max;
        for (int i = 0; i < nums.length-k; i++) {
            max = max - nums[i] + nums[i+k];
            sum = Math.max(sum, max);
        }
        return (sum * 1.0 / k);
    }

