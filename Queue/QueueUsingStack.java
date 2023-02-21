package Queue;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {

    }
    class MyStack{
        Stack s1;
        Stack s2;
        void push(int data){
            s1.push(data);
        }

        int pop(){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int ans = (int) s2.pop();
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return ans;
        }

        void peek(){
            
        }
    }

}
