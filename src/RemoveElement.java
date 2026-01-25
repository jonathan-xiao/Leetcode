import java.util.Arrays;

public class RemoveElement {
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

    public int removeElement2(int[] nums, int val) {
        int pointer = 0;
        int k = 0;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                pointer++;
            } else {
                nums[i-pointer] = nums[i];
                k++;
            }
        }
        return k;
    }
}

void main() {
}
