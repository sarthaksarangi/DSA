package Stack;

import java.util.Stack;

public class ReverseAStack {
    public static void insertAtBottom(Stack<Integer> s , int data){
        if (s.size()==0){
            s.push(data);
            return;
        }
        int top = s.pop();
        insertAtBottom(s,data);
        s.push(top);

    }
    public static void reverseStack(Stack <Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        insertAtBottom(s,top);

    }
    public static void printStack(Stack<Integer>s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
        return;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3,2,1
        reverseStack(s);
        //1,2,3
        printStack(s);
    }

}
