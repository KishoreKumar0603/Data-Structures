package Kunal.Tree;

public class BST {
    private class Node {
        int val;
        private Node left, right;
        private int height;
        public Node(int val){
            this.val =  val;
            this.left = this.right = null;
        }
        public int getValue() {
            return val;
        }
    }

    private Node root;
    public BST(){
    }


    public int getHeight(Node node) {
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }


    public void populate(int[] nums){
        for(int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(node.val > value) {
            node.left = insert(value, node.left);
        }

        if(node.val < value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right) + 1);

        return node;
    }

    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, "Root Node : ");
    }

    public void display(Node node, String indent) {
        if(node == null) return;
        System.out.println(indent + node.val);
        display(node.left, "Left child of " + node.val + " : ");
        display(node.right, "Right child of " + node.val + " : ");
    }


    //Traversal
    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val +" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }

    public void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }

}
