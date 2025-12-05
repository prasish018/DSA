package delfromstart;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    void deleteBeginning() {
        if (head == null) {
            System.out.println("List Empty!");
            return;
        }
        head = head.next;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.deleteBeginning();
    }
}
