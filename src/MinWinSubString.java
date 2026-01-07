import java.util.HashMap;

public class MinWinSubString {

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        String min = "";
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            while (inWindow(freq, window)) {
                if (min.equals("")) {
                    min = s.substring(left, right + 1);
                } else if (min.length() > right - left + 1) {
                    min = s.substring(left, right + 1);
                }
                window.put(s.charAt(left), window.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }
            right++;
        }
        return min;
    }

    public boolean inWindow(HashMap<Character, Integer> freq, HashMap<Character, Integer> window) {
        for (char c: freq.keySet()) {
            if (window.containsKey(c)) {
                if (freq.get(c) <= window.get(c)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
