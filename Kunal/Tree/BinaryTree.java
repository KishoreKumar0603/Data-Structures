package Kunal.Tree;

import java.util.Scanner;

public class BinaryTree {


    private static class Node{

     int val;
     Node left,right;
     public Node(int val){
        this.val = val;
        this.left = this.right = null;
    }
    }
    BinaryTree(){

    }
    private Node root;

    //Insertion

    public void populate(Scanner scanner){
        System.out.println("Enter the Value of the Root Node : ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node root){
        System.out.println("Do you want to enter the left value of "+root.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the Value for the left : ");
            int val = scanner.nextInt();
            root.left = new Node(val);
            populate(scanner, root.left);
        }

        System.out.println("Do you want to enter the right valu of "+root.val);
        boolean right = scanner.nextBoolean();

        if(right){
            System.out.println("Enter the Value for the Righ : ");
            int val = scanner.nextInt();
            root.right = new Node(val);
            populate(scanner, root.right);
        }
    }

    public int root(){
        return this.root.val;
    }
}
