public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        return isHappyHelp(nextNum(n), n);
    }

    public boolean isHappyHelp(int n, int m) {
        if (n == 1) return true;
        if (n == m) return false;
        return isHappyHelp(nextNum(nextNum(n)), nextNum(m));
    }

    public int nextNum(int n) {
        String k = Integer.toString(n);
        int next = 0;
        for (int i = 0; i < k.length(); i++) {
            char c = k.charAt(i);
            int here = Integer.parseInt(c + "");
            next += Math.pow(here, 2);
        }
        return next;
    }
}
