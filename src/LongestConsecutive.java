public int LongestConsecutive(int[] nums, int k) {
    if (nums == null || nums.length == 0) {
        return 0;
    }
    int max = 0;
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }
    for (int num : set) {
        if (!set.contains(num - 1)) {
            int curr = num;
            int currcount = 1;
            while (set.contains(curr+1)) {
                curr++;
                currcount++;
            }
            max = Math.max(max, currcount);
        }

    }
    return max;
}

void main() {
}