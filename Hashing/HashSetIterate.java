package Hashing;
import java.util.*;


public class HashSetIterate {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Sarthak");
        hs.add("Rohan");
        hs.add("gnuuu");

        //Iterate over the hashset using the iterator function which comes in built in java

        //Make a object of type iterator
        Iterator i = hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}
