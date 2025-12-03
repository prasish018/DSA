package singly_linked_list;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
public class TestLL {
    public static void main(String[] args) {
        System.out.println("Name: Prasish Gautam");
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.display();
    }
}
