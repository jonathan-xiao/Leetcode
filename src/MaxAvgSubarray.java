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

