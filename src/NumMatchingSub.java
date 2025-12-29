import java.util.HashMap;

public class NumMatchingSub {
    void main(String[] args) {
        String[] test = new String[]{"a","bb","acd","ace"};
        String[] test2 = new String[]{"lv"};
        System.out.println(numMatchingSubseq("abcde", test));
        System.out.println(numMatchingSubseq("llllllllllllllll", test2));
    }

    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        for (String w: words) {
            if (test(s, w)) {
                count++;
            }
        }
        return count;
    }

    public boolean test(String s, String t) {
        int cur = 0;
        for (int i = 0; i < s.length(); i++) {
            if (cur >= t.length()) {
                break;
            }
            if (s.charAt(i) == t.charAt(cur)) {
                cur++;
            }
        }
        return cur == t.length();
    }
}
