import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class hash_set_tree_2 {
    public static void main(String[] args) {
        HashSet<String > hs1 =new HashSet<>
                (Arrays.asList("Erdem" , "Furkan" , "Samet " , "Hakan"));
    HashSet<String> hs2 = new HashSet<>
            (Arrays.asList("basarili", "azimli" ," nasipli"));
        System.out.println();
    hs1.addAll(hs2);// hs1 i hs2 nin icine attik
        hs1.add("halil");//hs1 e ekleme yaptik
        System.out.println(hs1);
        System.out.println(hs1.remove("basarili"));
        System.out.println(hs1.size());
        System.out.println(hs1.isEmpty());
        System.out.println(hs1.contains("halil"));
    }
}
