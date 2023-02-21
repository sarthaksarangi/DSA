package Hashing;
import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "race";
        String t = "arce";
        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s, String t){

        //Check for equal lenght of string
        if(s.length()!= t.length()){
            return false;
        }

        HashMap<Character,Integer> map= new HashMap<>();
        //Add all the characters of string s to map
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < t.length() ; i++) {
            char ch = s.charAt(i);
            //If map.get(ch) is not null that is a value exists at ch then
            if (map.get(ch)!= null){
                //Remove if freq = 1
                if (map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch) -1);
                }

            }
            //If value of character is null ie character of t is not present on string s
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
}
