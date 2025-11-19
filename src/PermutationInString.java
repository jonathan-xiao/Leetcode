public static void main(String[] args) {
    int[] test = {1, 2, 3};
    int[] h1 = {1,1,1};
    int[] test1 = {2, 3, 4, 6, 10};
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(permutation("cbaebabacd", "abc"));

}

public static boolean permutation(String s1, String s2) {
    if (s2.length() < s1.length()) {
        return false;
    }
    char[] ss = s2.toCharArray();
    char[] ps = s1.toCharArray();
    Arrays.sort(ps);
    char[] window = new char[ps.length];
    for (int i = 0; i <= ss.length-window.length; i++) {
        for (int j = i; j < i+window.length; j++) {
            window[j-i] = ss[j];
        }
        Arrays.sort(window);
        if (Arrays.equals(window, ps)) {
            return true;
        }
    }
    return false;
}

public static boolean permutation2(String s1, String s2) {
    if (s1.length() < s2.length()) {
        return false;
    }
    int[] count = new int[26];
    // incomplete
    return true;

}

