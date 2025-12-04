import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class SplitConsSubsequence {
    void main(String[] args) {
        int[] a = new int[]{1,2,3,3,4,5};
        int[] b = new int[]{1,2,3,4,5};
        int[] c = new int[]{1,2,3,4,4,5,5};
        System.out.println(isPossible(a));
        System.out.println(isPossible(b));
        System.out.println(isPossible(c));
    }

    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> app = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (freq.get(num) == 0) {
                continue;
            }
            if (app.getOrDefault(num, 0) > 0) {
                app.put(num, app.get(num) - 1);
                app.put(num + 1, app.getOrDefault(num+1,0) + 1);
            } else if (freq.getOrDefault(num+1, 0) > 0 && freq.getOrDefault(num+2, 0) > 0) {
                freq.put(num+2, freq.get(num+2) - 1);
                freq.put(num+1, freq.get(num+1) - 1);
                app.put(num+3, app.getOrDefault(num+3,0) + 1);

            } else {
                return false;
            }
            freq.put(num, freq.get(num) -1);

        }
        return true;

    }
}
