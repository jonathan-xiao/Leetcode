public static void main(String[] args) {
    int[] test = {1, 3, 5};
    int[] h1 = {1,1};
    int[] test1 = {2, 3, 4, 6, 10};
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(GoodPair(h1));
    GoodPair(height);
}

public static int GoodPair(int[] nums) {
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    for (int i : map.values()) {
        count += i*(i-1)/2;
    }
    return count;
}

// 1 0
// 2 1
// 3 3
// 4 6