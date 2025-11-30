public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curr++;
                max = Math.max(curr, max);
            } else if (nums[i] == 0) {
                curr = 0;
            }
        }
        return max;
    }

    public int findMaxConsecutiveOnes1(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int max = 0;
        int left = 0;
        int z = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            }
            while (z > k) {
                if (nums[left] == 0) {
                    z--;
                }
                left++;
            }
            max = Math.max(i - left + 1, max);
        }
        return max;
    }
}
