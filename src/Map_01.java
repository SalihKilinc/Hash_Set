import java.util.HashMap;
import java.util.Map;

public class Map_01 {
    public static void main(String[] args) {
        Map<String, String> yagmurKartvizit = new HashMap<>();
        yagmurKartvizit.put("isim" , "yagmur damla");
        yagmurKartvizit.put("email" , "yagmur@ damla");
        yagmurKartvizit.put("adres" , "caminin yani");
        yagmurKartvizit.put("telefon" , "0123456789");
        System.out.println(yagmurKartvizit);
       // System.out.println(yagmurKartvizit.get(\"isim\")= + yagmurKartvizit.get("isim");
    }
}
