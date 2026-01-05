public class BestSightsee {
    public int maxScoreSightseeingPair(int[] values) {
        int curr = values[0] + values[1] - 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                curr = Math.max(curr, values[i] + values[j] - j + i);
                max = Math.max(max, curr);
            }
        }
        return max;
    }

    public int maxScoreSightseeingPair2(int[] values) {
        int currI = values[0];
        int bestI = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < values.length; i++) {
            currI = Math.max(currI, values[i-1] + i-1);
            bestI = Math.max(bestI, currI);
            max = Math.max(bestI + values[i] - i, max);
        }
        return max;
    }

}
