import java.util.HashMap;

public class ContainsDuplicateII {
    public boolean containsDuplicateII(int[] nums, int k) {
        boolean found = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    found  = true;
                    break;
                }
            }
            map.put(nums[i], i);
        }
        return found;
    }
}
