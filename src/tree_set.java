import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class tree_set {
     /*
            Soru: Elemanlari Alfabetik sirada dizen ve tekrarsiz bir collection elde etmek isterseniz ne kullanirsiniz
            Cevap: TreeSet
            Soru: Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin?
            Cevap: HashSet olustururum, elemanlari HashSet'e eklerim.
            Sonra HashSet'i TreeSet'e ceviririm boylece tekrarsiz ve alfabetik sirada bir collection'a sahip olmus olurum.
     */
     public static void main(String[] args) {
         long start1=System.currentTimeMillis();
          TreeSet<String> ts1 =new TreeSet<>
                  (Arrays.asList("Salih" , "Havva" , "Selma" , "Semra" , "Kenan"));
          long stop1=System.currentTimeMillis();
          System.out.println("treeset hizi :" +(stop1-start1));

          long start=System.currentTimeMillis();
          HashSet<String> hs=new HashSet<>  (Arrays.asList("Semra" , "Selma" , "Kenan" , "Salih" , "Havva"));
          System.out.println(hs);
    TreeSet<String> ts =new TreeSet<>(hs);
          System.out.println(ts);
          long stop=System.currentTimeMillis();
          System.out.println("hashSet ile hizi :" +(stop-start));

     }
}
