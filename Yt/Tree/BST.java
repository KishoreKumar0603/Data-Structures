package Yt.Tree;

public class BST {
    public class Node {
    
        int val;
        Node left;
        Node right;
        
        Node(int value){
            this.val = value;
            left=right=null;
        }
    }

    public Node root;

    Node insert(Node root,int val){
        if(root == null)
        {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        }
        else if(val > root.val)
        {
            root.right = insert(root.right, val);
        }
        return root;
    }

    void inOrder(Node root){
        if(root != null)
        {
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }
    void preOrder(Node root){
        if(root != null)
        {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void postOrder(Node root){
        if(root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.val);
        }
    }

    Node delete(Node root, int val)
    {
        if(root == null) return root;

        if(val < root.val)
        {
            root.left = delete(root.left, val);
        }
        else if(val > root.val)
        {
            root.right = delete(root.right, val);
        }
        else{
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            
            root.val = minValue(root.right);
            root.right = delete(root.right, root.val);
        }

        return root;
    }

    // Get min value node in a subtree
    int minValue(Node root) {
        int min = root.val;
        while (root.left != null) {
            min = root.left.val;
            root = root.left;
        }
        return min;
    }
}
