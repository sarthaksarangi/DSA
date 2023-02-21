package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Priority {
    public static void main(String[] args) {
        //Comparator.revdrseOrder() to reverse the logic
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println( pq.peek());
           pq.remove();
        }
    }
}
