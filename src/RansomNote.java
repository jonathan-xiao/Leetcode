public static void main(String[] args) {
    String[] strs = {"eat", "ate", "dd", "tea", "frear"};
    System.out.println(ransomNote("a", "b"));

}

public static boolean ransomNote(String ransomnote, String magazine) {
    boolean ransom = true;
    char[] ransomNote = ransomnote.toCharArray();
    char[] magazineNote = magazine.toCharArray();
    Map<Character, Integer> m = new HashMap<>();
    Map<Character, Integer> r = new HashMap<>();
    for (char c : magazineNote) {
        m.put(c, m.getOrDefault(c, 0) + 1);
    }
    for (char c : ransomNote) {
        r.put(c, r.getOrDefault(c, 0) + 1);
    }
    for (char c : magazineNote) {
        if (m.getOrDefault(c, 0) < r.getOrDefault(c, 0)) {
            ransom = false;
        }
    }
    return ransom;
}
