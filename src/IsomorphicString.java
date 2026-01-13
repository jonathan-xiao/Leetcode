import java.util.HashMap;
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> st = new HashMap<>();
        HashMap<Character, Character> ts = new HashMap<>();
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (st.containsKey(s.charAt(i))) {
                if (st.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                // d will just put another b into the second slot which seems valid to the current code
                st.put(s.charAt(i), t.charAt(i));
            }
            // so check for bijection
            if (ts.containsKey(t.charAt(i))) {
                if (ts.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                ts.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }

    void main() {
    }
