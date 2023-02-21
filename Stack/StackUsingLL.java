package Stack;

public class StackUsingLL {
    static class Node{
       static int data;
       static Node next;
        Node(int data){
            this.data= data;
            next = null;
        }
        static class Stack{
           static Node head;
           static boolean isEmpty(){
               return head==null;
           }
            public static void push(int data){
               Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }


        }
    }
}
