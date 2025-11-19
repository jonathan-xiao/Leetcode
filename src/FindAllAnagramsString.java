
    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) {
            return ans;
        }
        char[] ss = s.toCharArray();
        char[] ps = p.toCharArray();
        Arrays.sort(ps);
        char[] window = new char[ps.length];
        for (int i = 0; i <= ss.length-window.length; i++) {
            for (int j = i; j < i+window.length; j++) {
                window[j-i] = ss[j];
            }
            Arrays.sort(window);
            if (Arrays.equals(window, ps)) {
                ans.add(i);
            }
        }
        return ans;
    }

    void main() {
    }


