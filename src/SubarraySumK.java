public static void main(String[] args) {
    int[] test = {1, 2, 3};
    int[] h1 = {1,1,1};
    int[] test1 = {2, 3, 4, 6, 10};
    int[] height = {1,8,6,2,5,4,8,3,7};
    SubarraySumK(test, 2);

}

public static int SubarraySumK(int[] nums, int k) {
    int count = 0;
    int cur = 0;
    int[] dp = new int[nums.length+1];
    dp[0] = 0;
    for  (int i = 1; i <= nums.length; i++) {
        dp[i]=dp[i-1]+nums[i-1];
    }
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j <= nums.length; j++) {
            if (dp[j]-dp[i] == k) {
                count++;
            }
        }
    }
    System.out.println(count);
    return count;
}