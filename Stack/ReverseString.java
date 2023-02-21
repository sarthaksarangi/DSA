//Reverse a string using a stack
package Stack;
import java.util.*;
public class ReverseString {
    public static String reverseString(String str){
        Stack <Character> s = new Stack<>();
        int index = 0;
        while (index<str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder st = new StringBuilder();
        while(!s.isEmpty()){
            char res = s.pop();
            st.append(res);
        }
        return st.toString();

    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println( reverseString(str));

    }
}
