public class MySqrt {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        for (int i = 1; i<=x; i++) {
            if (i > x/i) {
                return i-1;
            }
        }
        return 0;
    }
}
