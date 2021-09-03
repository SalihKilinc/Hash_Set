import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Hash_Set {
    /*
           Soru: Elemanlari Alfabetik sirada dizen ve tekrarsiz bir collection elde etmek isterseniz ne kullanirsiniz
           Cevap: TreeSet
           Soru: Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin?
           Cevap: HashSet olustururum, elemanlari HashSet'e eklerim.
           Sonra HashSet'i TreeSet'e ceviririm boylece tekrarsiz ve alfabetik sirada bir collection'a sahip olmus olurum.
    */
    public static void main(String[] args) {
        HashSet<String> hs =new HashSet<>
                (Arrays.asList("Said", "Dora" ," hasan" , "oguz" , "sedef"));
        System.out.println(hs);
        TreeSet<String> ts =new TreeSet<>(hs);
        System.out.println(hs);

    }
}
