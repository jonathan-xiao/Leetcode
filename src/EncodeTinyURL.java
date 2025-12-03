import java.util.HashMap;

public class EncodeTinyURL {
    private HashMap<Integer, String> map = new HashMap<>();
    private int key = 0;
    private String site = "https://tinyurl.com/";

    public String encode(String longUrl) {
        map.put(key, longUrl);
        return site + key;
    }


    public String decode(String shortUrl) {
        int key = Integer.parseInt(shortUrl.replace(site, ""));
        return map.get(key);
    }
}
