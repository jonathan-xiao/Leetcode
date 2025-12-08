public class FirstMissingPositive {
    void main(String[] args) {
        int[] a = {1,3,4,7};
        int[] b = {2,3,4,5};
        int[] c = {3,4,-1,1};
        int[] d = {0,3,1,2,6};
        int[] e = {1};
        int[] f = {2};
        System.out.println(firstMissingPositive(a));
        System.out.println(firstMissingPositive(b));
        System.out.println(firstMissingPositive(c));
        System.out.println(firstMissingPositive(d));
        System.out.println(firstMissingPositive(e));
        System.out.println(firstMissingPositive(f));
    }

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
}
