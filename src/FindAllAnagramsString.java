public static void main(String[] args) {
    int[] test = {1, 2, 3};
    int[] h1 = {1,1,1};
    int[] test1 = {2, 3, 4, 6, 10};
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(findAnagrams("cbaebabacd", "abc"));

}

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


