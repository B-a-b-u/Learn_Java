package linkedlist;


// It is a structure for individual node of Singly Linked List
// class Node{
//     public int data;
//     public Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// It is a structure for individual node of Doubly Linked List
class Node{
    public int data;
    public Node next;
    public Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}



// Linked List with one pointer => head
// class LinkedList {
//     public Node head;

//     LinkedList(){
//         this.head = null; // head will be null initially
//     }

//     // add element in linked list
//     public void add(int value){

//         Node node = new Node(value);

//         if (this.head == null) {
//             this.head = node; // if node is first element, then head should point to this node
//         }
//         else{
//             Node temp = this.head;

//             // Finding the last element
//             while(temp.next != null){
//                 temp = temp.next;
//             }

//             // update last elements next to new node
//             temp.next = node;
//         }
        
//     }

//     // Display elements
//     public void display(){
//         Node temp = this.head;
//         while(temp != null){
//             System.out.println("Element : "+temp.data);
//             temp = temp.next;
//         }
//     }
    
// }


// LinkedList with two pointers => head and tail
class LinkedList {
    Node head;
    Node tail;

    LinkedList(){
        this.head = null;
        this.tail = null;
    }

    // add element at start of the linked list
    public void addFirst(int value){
        Node node = new Node(value);
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }

     // add element at end of the linked list
    public void addLast(int value){
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node; // if node is first element, then head should point to this node
            // Initially both pointers points to first element only
            this.tail = node;
        }
        else{
           tail.next = node;
           tail = node;
        }
    }

    public void delLast(){}
    public void delFirst(){}
}


class DoublyLinkedList{
    public Node head;
    public Node tail;

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addLast(int value){
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        }
        else{
            node.prev = this.tail;
            this.tail.next = node;
            this.tail = node;
        }
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        }
        else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.println("Element : "+temp.data);
            temp = temp.next;
        }
    }


}

public class MyLinkedList{
    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        // list.add(10);
        // list.add(20);
        // list.display();
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // list.display();

        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        // list.display();
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.display();

       
    }
}