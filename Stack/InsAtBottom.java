//Insert at bottom of the stack using recursion.
package Stack;
import java.util.*;
public class InsAtBottom {
    public static void insertAtBottom(Stack<Integer> s , int data){
        if (s.size()==0){
            s.push(data);
            return;
        }
        int top = s.pop();
        insertAtBottom(s,data);
        s.push(top);

    }


    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        insertAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }

    }
}
