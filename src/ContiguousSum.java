import java.util.HashMap;

public class ContiguousSum {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int cur = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            cur += (nums[i] == 0) ? -1 : 1;
            if (map.containsKey(cur)) {
                int prev = map.get(cur);
                max = Math.max(i-prev, max);
            } else {
                map.put(cur, i);
            }
        }
        return max;
    }
}
