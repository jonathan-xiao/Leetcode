public class SortColors {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while (i <= right) {
            if (nums[i] == 0) {
                nums[i] = nums[left];
                nums[left++] = 0;
                i++;
            }
            else if (nums[i] == 2) {
                nums[i] = nums[right];
                nums[right--] = 2;
            } else {
                i++;
            }
        }
    }
}
