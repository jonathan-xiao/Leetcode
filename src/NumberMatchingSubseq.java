import java.util.HashMap;

public class NumberMatchingSubseq {
    void main(String[] args) {

    }

    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < words.length; i++) {

        }
        // WIP
        return null;
    }
}
