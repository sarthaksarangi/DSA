package Queue;

public class CircularQueue {
    static int size;
   static int [] arr;
    static int rear=-1;
    static int front=-1;

    CircularQueue(int size){
        arr = new int[size];
        this.size= size;
    }

    static boolean isEmpty(){

        return rear==-1 & front==-1;
    }
    static boolean isFull(){
        return (rear+1) % size == front;
    }
    //enqueue O(1)
    static void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        //only for the first element
        if(front==-1){
            front = 0;
        }
        rear = (rear+1) % size ;
        arr[rear] = data;
    }

    //dequeue O(1)
    static int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int result = arr[front];
        if(rear==front){
            rear = front = -1;
        }
        front= (front+1)%size;
        return result;

    }




}
