public static void main(String[] args) {
    int[] test = {1, 2, 3};
    int[] h1 = {1,1,1};
    int[] test1 = {2, 3, 4, 6, 10};
    int[] height = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(maxSum3(height, 10));

}

public static long maxSum(int[] nums, int k) {
    int max = 0;

    for (int i = 0; i <= nums.length-k; i++) {
        boolean[] visited = new boolean[10000001];
        boolean distinct = true;
        int sum = 0;
        for (int j = i; j < i+k; j++) {
            if (visited[nums[j]]) {
                distinct = false;
                break;
            }
            visited[nums[j]] = true;
            sum += nums[j];
        }
        if (distinct) {
            max = Math.max(max, sum);
        }
    }

    return max;
}

public static long maxSum2(int[] nums, int k) {
    long max = 0;

    for (int i = 0; i <= nums.length - k; i++) {
        Set<Integer> seen = new HashSet<>();
        long sum = 0;
        boolean distinct = true;

        for (int j = i; j < i + k; j++) {
            if (!seen.add(nums[j])) {
                distinct = false;
                break;
            }
            sum += nums[j];
        }

        if (distinct) {
            max = Math.max(max, sum);
        }
    }

    return max;
}

public static long maxSum3(int[] nums, int k) {
    long max = 0;
    int n = nums.length;

    for (int start = 0; start <= n - k; start++) {
        Set<Integer> seen = new HashSet<>();
        long sum = 0;
        int end = start;

        while (end < n) {
            int num = nums[end];

            if (seen.contains(num)) {
                break;
            }

            seen.add(num);
            sum += num;
            end++;

            if (end - start == k) {
                max = Math.max(max, sum);
                break;
            }
        }
    }

    return max;
}