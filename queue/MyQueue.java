package queue;

// Queue
/*
 * Enqueue => add items
 * Dequeue => remove items, returns removed item
 * Two pointers => front, rear
 */


public class MyQueue{

    private int[] queue;
    private int front;
    private int rear;
    private int capacity; // max size of queue
    private int size; // current size of queue

    MyQueue(int capacity){

        // front pointing to same element
        this.front = 0;
        this.rear = -1; // if enqueued, rear first increments and then only stores the value
        this.capacity = 10;
        this.size = 0;
        this.queue = new int[capacity];
    }

    // check is full
    public boolean isFull(){
        return size == capacity;
    }

    // check is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // to view item to remove or in front of the queue
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // to remove element at front of the queue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int removedElement = queue[front];
        front = (front+1) % capacity;
        size -= 1;
        System.out.println("Dequeued front : "+front+" Rear : "+rear);
        return removedElement;
    }

    // to add element at back side of the queue
    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear+1) % capacity;
        queue[rear] = element;
        size += 1;
        System.out.println("Enqueued : "+element+"front : "+front+" Rear : "+rear);

    }

    // not a queue operation just for my understanding
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Displaying :"+front+" "+size);
        int count = 0;
        for(int i=front; count<size; i = (i+1)%capacity, count += 1){
            System.out.println("Element "+(count+1)+" : "+queue[i]);
        }
    }
    
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(10);
        queue.enqueue(10);
        System.out.println(queue.peek());
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("Removed : "+queue.dequeue());
        System.out.println("Removed : "+queue.dequeue());
        System.out.println("Removed : "+queue.dequeue());
        queue.display();
        System.out.println("Removed : "+queue.dequeue());
        
        // Task :
        /*
        * Enqueue 10 numbers
        * Dequeue 5 numbers
        */
        for(int i=10; i<=100; i += 10){
            queue.enqueue(i);
        }
        for(int i=5; i> 0; i--){
            System.out.println("Removed : "+queue.dequeue());
        }
        queue.display();
    }

    
}