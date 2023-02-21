package Queue;

public class QueueusingArray {

    static class Queue{
       static int size;
       static int[] arr;
       static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size= n;
        }
        //isEmpty
        static boolean isEmpty(){
            return rear==-1;
        }
        //add/enqueue
        static void add(int value){
            if(rear==size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear]=value;
        }
        //deque/remove
        static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i]= arr[i+1];
            }
            rear--;
            //as one element of the queue is removed so now the all the elements will move one place forward in the queue
           return front;

        }
        static int peak(){
            if(isEmpty()) {
                return -1;
            }
            return arr[0];
        }

        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(5);
            q.add(10);
            q.add(11);
            while(q.isEmpty()==false){
                System.out.println(q.remove());
            }

        }


    }
}
