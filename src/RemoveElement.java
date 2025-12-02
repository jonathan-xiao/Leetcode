import java.util.Arrays;

public class RemoveElement {
    void main() {
        int[] a = new int[]{1,2,3,2,3,1};
    }

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int k = 0;
        int shift = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                shift++;
            } else {
                nums[i-shift] = nums[i];
                k++;
            }
        }
        return k;
    }
}
