import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxSubarray {
    void main(String args[]) {
        int[] a = new int[]{1,2,3,-4,3};
        int[] b = new int[]{1,-2,3,-2};
        System.out.println(maxSumCircular(a));
        System.out.println(maxSumCircular(b));
        System.out.println(maxSubArray(b));
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
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(num, max * num);
            min = Math.min(num, min * num);

            res = Math.max(res, max);
        }
        return res;
    }

    public int maxSumCircular(int[] nums) {
        int max = nums[0];
        int curr = nums[0];
        if (nums.length == 1) {
            return nums[0];
        }
        int min = Integer.MAX_VALUE;
        int currr = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);;
            currr = Math.min(nums[i], currr + nums[i]);
            min = Math.min(min, currr);
        }
        if (sum == min) {
            return max;
        } else {
            return Math.max(max, sum - min);
        }
    }
}
