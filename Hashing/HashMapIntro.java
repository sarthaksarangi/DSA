package Hashing;
import java.util.*;
public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Sarthak",99);
        hm.put("Rohan",89);
        System.out.println(hm);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k:keys) {
            System.out.println("Key = "+k +" Value = "+hm.get(k));
        }
    }
}
