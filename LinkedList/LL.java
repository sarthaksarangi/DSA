package LinkedList;

public class LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //First create a new Node
        Node newNode = new Node(data);
        size++;
        //Check if linked list is empty at first
        if (head == null){
            head = tail = newNode;
            head.next = null;
            return;
        }
        // if the linked list is not empty then make the newNode point towards the head and the change the value of head to the newNode
        newNode.next = head;
        head = newNode;

    }
    public void addLast(int data){
        //Step 1 Create a new node
        Node newNode = new Node(data);
        size++;
        //Special Case : If Linked List is Empty
        if (head== null){
            head = tail = newNode;
            return;
        }
        //Step 2 Make the pointer of the tail towards the newNode
        tail.next = newNode ;
        //Step 3 : Make the tail as NewNode
        tail = newNode;

    }
    public void print(){
        Node temp = head;
        //If linked list is empty
        if (head == null){
            System.out.println("Linked list is Empty");
        }
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void add(int idx , int data){


        Node temp = head;
        int i = 0;
        //Special case if idx = 0
        if (idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        //Step 1
        //Search for the previous idx of the given index
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //After exiting the while loop i = idx-1 ie the previous Node
        //Now make the newNode point towards the prev.next Node
        newNode.next = temp.next;
        //make the idx-1 node point towards the newNode
        // after that the link will break automatically

        temp.next = newNode;
    }
    public int removeFirst(){
        //If linked list is empty
        if (head== null){
            System.out.println("Linked list is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public int removeLast(){
        //If linked list is Empty
        if (head == null){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;

        }
        //If the Linked List has only one element in it
        if (size == 1){
            int val = head.data;
            head =tail = null;
            size = 0;
            return val;
        }
        //Prev = size -2
        Node prev = head;
        //Traverse till size-2
        for (int i = 0; i <size-2 ; i++) {
            prev = prev.next;

        }
        int val = prev.next.data;// tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int iterativeSearch(int key){
        Node temp = head;
        int idx = 0;
        while(temp!= null){
            if (temp.data == key){
                return idx;
            } else
                temp = temp.next;
            idx++;
        }
        return -1;
    }

    public static void main(String[] args) {
       LL ll = new LL();
       ll.print();
       ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.add(2,5);
        ll.print();
        System.out.println(size);
        ll.removeFirst();
        ll.print();
        System.out.println(size);
        ll.removeLast();
        ll.print();
        System.out.println( ll.iterativeSearch(3));





    }
}
