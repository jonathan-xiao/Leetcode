public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                flag[nums[i] - 1] = true;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (flag[i] == false) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    public int firstMissingPositive2(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > n || nums[i] < 1) {
                nums[i] = n+1;
            }
        }
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            if (x > 0 && x <= n) {
                nums[x-1] = -Math.abs(nums[x-1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
