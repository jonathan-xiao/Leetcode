public class MaxSubarray {
    void main(String args[]) {
        int[] a = new int[]{1,2,3,-4,-3};
        System.out.println(maxProduct(a));
    }

    public int maxSubArray(int[] nums) {
        int curr =  nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }

    public int maxProduct(int[] nums) {
        // in progress
        int max = Integer.MIN_VALUE;
        int curr = nums[0];
        for (int i = 1; i < nums.length; i++) {

        }
        return max;
    }
}
