package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);

        root.left.left = new Node(1);
        root.right.right = new Node(14);

        root.right.right.left = new Node(13);
        root.right.right.right = new Node(17);
        root.right.right.right.right = new Node(22);

        Node.print2D(root);
        System.out.println("");
        System.out.println("Height of tree is : " +
                tree.maxDepth(root));     }
}
