public class NumArray {

    private int[] dp;

    public NumArray(int[] nums) {
        dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
    }

    public int[] getdp() {
        return dp;
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return dp[right];
        }
        return dp[right] - dp[left - 1];
    }
}
