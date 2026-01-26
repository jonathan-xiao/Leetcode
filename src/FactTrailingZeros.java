public class FactTrailingZeros {
    public int trailingZeroes(int n) {
        int count = 0;
        int pwr = 1;
        while ((Math.pow(5, pwr) <= n)) {
            count += n / Math.pow(5, pwr);
            pwr++;
        }
        return count;
    }
}
