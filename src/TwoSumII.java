public static void main(String[] args) {
    int[] test = {1, 3, 5};
    int[] test1 = {2, 3, 4, 6, 10};
    TwoSumII(test1, 9);
}

public static int[] TwoSumII(int[] numbers, int target) {
    int[] result = new int[2];
    for (int i = 0; i < numbers.length; i++) {
        for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i+1;
                result[1] = j+1;
            }
            if (numbers[i] + numbers[j] > target) {
                break;
            }
        }
    }
    System.out.println(Arrays.toString(result));
    return result;
}
