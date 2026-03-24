class StackLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null; // top of stack

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top; // link new node to previous top
        top = newNode;      // update top

        System.out.println(data + " pushed into stack");
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int popped = top.data;
        top = top.next; // move top to next node

        return popped;
    }

    // isEmpty operation
    boolean isEmpty() {
        return top == null;
    }

    // Display (optional but useful)
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method for testing
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();

        s.push(
            10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Popped: " + s.pop());
        s.display();

        System.out.println("Is Empty: " + s.isEmpty());
    }
}