package LinkedList;

public class RecursiveSearchLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
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

    public int helper(Node head, int key){
        if (head==null){
            return -1;
        }
//        If the data of head matches the key then return 0 and the previous calls will return 0 with adding one through each call to return the
//        current index
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next,key); //Check for the next value by making the next node head
        if(index == -1){
            return -1;
        }
        return index+1;


    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }



        public static void main(String[] args) {
            RecursiveSearchLL ll = new RecursiveSearchLL();

            ll.addFirst(1);
            ll.addFirst(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.print();
            System.out.println(ll.recursiveSearch(3));





        }
    }

