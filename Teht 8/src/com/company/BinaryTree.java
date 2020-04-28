package com.company;

public class BinaryTree {

    private Node root;
    private int height = 1;

    public BinaryTree(int rootValue) {
        root = new Node(rootValue);
    }

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(int rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    }

    public void insert(int aData){
        if(root == null) {
            root = new Node(aData);
        }
        if(aData < root.getData()) {
            if(root.left() == null) {
                root.setLeft(new BinaryTree(aData));
            }
            else {
                root.left().insert(aData);
            }
        }
        if(aData > root.getData()) {
            if(root.right() == null) {
                root.setRight(new BinaryTree(aData));
            }
            else {
                root.right().insert(aData);
            }
        }
    }

    public void preOrder() {
        if (root == null) {
            return;
        }
        System.out.println(root.getData() + " ");
        if (root.left() != null){
            root.left().preOrder();
        }

        if (root.right() != null) {
            root.right().preOrder();
        }
    }

    int getHeight(BinaryTree node) {
        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = getHeight(node.getLeft());
            int rDepth = getHeight(node.getRight());

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

        public BinaryTree find(int aData){

        if(root == null) {
            return null;
        }

        if(aData == root.getData()) {
            return this;
        }

        if(aData < root.getData() && root.left() != null) {
            return root.left().find(aData);
        }

        if(aData > root.getData()&& root.right() != null) {
            return root.right().find(aData);
        }
        return null;

    }
    public void delete(int aData) {
        BinaryTree found = find(aData);

        if (found == null) {
            System.out.println("Puu on tyhjä");
        } else if( found.getRight()==null && found.getLeft()==null) {
            System.out.println("Poista ilman lehtiä");
            found.setRoot(null);
        } else if (found.getRight()==null && found.getLeft()!=null) {
            System.out.println("Poista vasemman lehden kanssa");
            found.setRoot(found.getLeft().getRoot());
        } else if (found.getRight()!=null && found.getLeft()==null) {
            System.out.println("Poista oikean lehden kanssa");
            found.setRoot(found.getRight().getRoot());
        } else {
            System.out.println("Poista molempien lehtien kanssa");
            found.setData(found.getRight().findMostLeft().getRoot().getData());
            found.getRight().findMostLeft().setRoot(null);
        }

    }

    public BinaryTree findMostLeft() {
        return (root.left() != null) ? root.left().findMostLeft(): this;
    }

    public Node getRoot() {
        return root;
    }

    public int getData() {
        return root.getData();
    }

    public BinaryTree getRight() {
        return root.right();
    }

    public BinaryTree getLeft() {
        return root.left();
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void setData(int data) {
        root.setData(data);
    }

    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}
