package stack;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }}
class StackLL {
    Node top;
    void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    } void pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
            return;
        }
        top = top.next; }
    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }}
    public class TestStack {
    public static void main(String[] args) {
        System.out.println("Name: Prasish Gautam");
        StackLL st = new StackLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        st.pop();
        st.display();
    }}
