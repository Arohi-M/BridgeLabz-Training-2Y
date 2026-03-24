import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReverseLinkedListStack {

    Node head;

    void reverseUsingStack() {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        // Push elements into stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Pop and assign back
        temp = head;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseLinkedListStack list = new ReverseLinkedListStack();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Original List:");
        list.printList();

        list.reverseUsingStack();

        System.out.println("Reversed List:");
        list.printList();
    }
}