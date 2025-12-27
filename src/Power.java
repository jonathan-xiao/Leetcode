public class Power {
    public double myPow(double x, int n) {
        long N = n;                 // prevent overflow
        return powHelp(x, 1.0, N);
    }

    public double powHelp(double x, double acc, long n) {
        if (n == 0) return acc;

        if (n < 0) {
            return powHelp(1 / x, acc, -n);
        }

        if ((n & 1) == 1) {
            return powHelp(x, acc * x, n - 1);
        } else {
            return powHelp(x * x, acc, n / 2);
        }
    }
}
