public static int MaxBalloons(String text) {
    int[] alphabet = new int[26];
    for (int i = 0; i < text.length(); i++) {
        alphabet[text.charAt(i) - 'a']++;
    }
    int balloon = Integer.MAX_VALUE;
    balloon = Math.min(alphabet['b'-'a'], balloon);
    balloon  = Math.min(alphabet['a'-'a'], balloon);
    balloon  = Math.min((alphabet['l'-'a'] / 2), balloon);
    balloon  = Math.min((alphabet['o'-'a'] / 2), balloon);
    balloon  = Math.min(alphabet['n'-'a'], balloon);
    System.out.println(balloon);
    return balloon;
}