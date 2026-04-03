package org.example;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class Tree {
    Node root;

    public void insert() {
        // root / 0th level
        this.root = new Node(10);
        Node node1 = new Node(15);
        Node node2 = new Node(20);
        root.left = node1;
        root.right = node2;

        // 1st level
        Node node11 = new Node(25);
        Node node12 = new Node(30);
        root.left.left = node11;
        root.left.right = node12;
        Node node21 = new Node(35);
        Node node22 = new Node(40);
        root.right.left = node21;
        root.right.right = node22;

        // 2nd level (commented out as in original)
        // Node node121 = new Node(55);
        // Node node122 = new Node(60);
        // root.left.right.left = node121;
        // root.left.right.right = node122;
        // Node node211 = new Node(65);
        // root.right.left.right = node211;

        // DFS Traversals
        // PREORDER  NLR --> 10-15-25-30-20-35-40
        // INORDER   LNR --> 25-15-30-10-35-20-40
        // POSTORDER LRN --> 25-30-15-35-40-20-10
        // BFS Level Order --> 10-15-20-25-30-35-40

        System.out.println("Preorder Traversal:");
        preorder(root);

        System.out.println("\nInorder Traversal:");
        inorder(root);

        System.out.println("\nPostorder Traversal:");
        postorder(root);

        System.out.println("\nLevel Order Traversal:");
        levelOrder(root);
    }

    public void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " "); // N
        preorder(root.left);               // L
        preorder(root.right);              // R
    }

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);                // L
        System.out.print(root.data + " "); // N
        inorder(root.right);               // R
    }

    public void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);              // L
        postorder(root.right);             // R
        System.out.print(root.data + " "); // N
    }

    public void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null)  queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert();
    }
}
