package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        q.add(1);
        q.add(3);
        q.add(5);
        reverseQueue(q);
    }
    static void reverseQueue(Queue<Integer>q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }



    }
}
