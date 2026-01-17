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

void main() {
}