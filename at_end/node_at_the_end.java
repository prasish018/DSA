package at_end;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }}
class LinkedList {
    Node head;
    void insertAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return; }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next; }
        temp.next = n;}
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; }
        System.out.println();}
        public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
    }
}
