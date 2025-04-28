package Yt.Tree;

import java.util.*;

public class BinaryTree {

    BinaryTree(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;
        
        Node(int val){
            this.value = val;
            left=right=null;
        }
    }
    Node root; 

    public void populate(Scanner scanner){
        System.out.print("Enter Value : ");
        int value = scanner.nextInt();
        System.out.println();
        root = new Node(value);
        populate(scanner, root);
    }
    public void populate(Scanner scanner, Node node){
        System.out.print("Do You want to enter the value in left : ");
        boolean insertLeft =   scanner.nextBoolean();
        System.out.println();
        if(insertLeft)
        {
            System.out.println("Enter the left Node Val : ");
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner,node.left);
        }
        System.out.print("Do You want to enter the value in Right : ");
        boolean insertRight =   scanner.nextBoolean();
        System.out.println();
        if(insertRight)
        {
            System.out.println("Enter the Right Node Val : ");
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(root, "");
    }
    private void display(Node node , String indent){
        if (node ==  null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }
    public Node insert(Node root2, int v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
}
