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

void main() {
}

// 1 0
// 2 1
// 3 3
// 4 6