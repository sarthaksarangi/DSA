package Queue;

import java.util.Stack;

public class QueUsingStack {
    static class Queue{
       static Stack<Integer> s1 = new Stack<>();
       static Stack<Integer> s2 = new Stack<>();
       static boolean  isEmpty(){
           return  s1.isEmpty();
        }
        public static void push(int data){ //O(n)
            while (!s1.isEmpty()){
              s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            return s1.pop();

        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);

        while(!q.isEmpty()){
            System.out.println(q.pop());
        }

    }
}
