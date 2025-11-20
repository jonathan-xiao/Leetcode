public static void main(String[] args) {
    String[] strs = {"eat", "ate", "dd", "tea", "frear"};
    System.out.println(groupAnagrams(strs));

}

public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
        ArrayList<String> list = new ArrayList<>();
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        list.add(str);
        map.get(key).add(str);
    }
    for (List<String> list : map.values()) {
        result.add(list);
    }
    return result;
}
