import java.util.HashMap;

public static void main(String[] args) {
    System.out.println(reorganizeString("bade"));
    System.out.println(reorganizeString("baad"));
    System.out.println(reorganizeString("baaa"));
    System.out.println(reorganizeString("baba"));

}

public static String reorganizeString(String s) {
    int n = s.length();
    StringBuilder sb = new StringBuilder();
    Map<Character, Integer> map = new HashMap<>();
    // frequency map
    for (char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
        if (map.get(c) > ((n+1)/2)) {
            return "";
        }
    }

    // get maximum
    char maxChar = 0;
    int maxCount = 0;
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() > maxCount) {
            maxCount = entry.getValue();
            maxChar = entry.getKey();
        }
    }

    char[] result = new char[n];
    int index = 0;

    while (map.get(maxChar) > 0) {
        result[index] = maxChar;
        index += 2;
        map.put(maxChar, map.get(maxChar) - 1);
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        char c = entry.getKey();
        int count = entry.getValue();
        while (count > 0) {
            if (index >= n) index = 1;
            result[index] = c;
            index += 2;
            count--;
        }
    }
    return String.valueOf(result);
}