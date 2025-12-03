package queue;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;}}
class QueueLL {
    Node front, rear;
    void enqueue(int x) {
        Node n = new Node(x);
        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;  }}
    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow!");
            return; }
        front = front.next;
        if (front == null) rear = null; }
    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;   }
        System.out.println("NULL");  }}
public class TestQueue {
        public static void main(String[] args) {
        System.out.println("Name: Prasish Gautam");
        QueueLL q = new QueueLL();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.display();
        q.dequeue();
        q.display();    }}
