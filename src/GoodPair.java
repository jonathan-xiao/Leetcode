public static int GoodPair(int[] nums) {
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int i : map.values()) {
        count += i*(i-1)/2;
    }
    return count;
}

void main() {
}
