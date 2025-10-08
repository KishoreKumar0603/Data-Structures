package Kunal.Tree.practice;

import org.ietf.jgss.GSSContext;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tree {

    private class Node{
        int val;
        Node left;
        Node right;

        public Node(int value){
            this.val = value;
            this.left = this.right = null;
        }
    }

    public Tree(){

    }

    Node root;
    public void insert(Scanner scanner){
        System.out.println("Enter the value for the Root : ");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner, root);
    }

    public Node insert(Scanner scanner , Node node){
        System.out.println("Do you want to Add left value to "+node.val +" : ");
        boolean isLeft  = scanner.nextBoolean();
        if (isLeft){
            System.out.println("Enter the value for the left Node : ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            insert(scanner, node.left);
        }
        System.out.println("Do you want to add Right Node to "+node.val+" : ");
        boolean isRight = scanner.nextBoolean();

        if (isRight){
            System.out.println("Enter the Value for the right Node : ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            insert(scanner, node.right);
        }
        return  node;

    }

    //traversal
    public void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }

    public void preOrder(Node node){
        if(node == null) return;
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }

}
