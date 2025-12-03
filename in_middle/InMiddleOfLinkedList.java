package in_middle;
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class InMiddleOfLinkedList {
    Node head;
    void insertAtMiddle(int pos, int data) {
        Node n = new Node(data);
        if (pos == 1) { 
            n.next = head;
            head = n;
            return;  }
        Node temp = head;
        for (int i = 1; i < pos-1 && temp != null; i++) {
            temp = temp.next; }
        if (temp == null) {
            System.out.println("Invalid Position!");
            return;  }
        n.next = temp.next;
        temp.next = n; }
    public static void main(String[] args) {
        InMiddleOfLinkedList list = new InMiddleOfLinkedList();
        list.insertAtMiddle(1, 10);
    }
}
