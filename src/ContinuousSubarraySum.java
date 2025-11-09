public static void main(String[] args) {
    int[] test = {1, 2, 3};
    int[] h1 = {1,1,1};
    int[] test1 = {2, 3, 4, 6, 10};
    int[] height = {4,5,0,-2,-3,1};
    int[] nums1 = {23,4,2,6,7};
    int[] nums2 = {23,2,6,4,7};
    int[] nums3 = {23,2,4,6,6};
    ContinuousSubarraySum(nums3, 7);
}

public static boolean ContinuousSubarraySum(int[] nums, int k) {
    int n = nums.length;
    for (int start = 0; start < n; start++) {
        int sum = 0;
        for (int end = start; end < n; end++) {
            sum += nums[end];
            if (end - start > 0 && sum % k == 0) {
                return true;
            }
        }
    }
    return false;
}