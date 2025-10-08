package Kunal.Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Binary Tree concept
//        BinaryTree tree = new BinaryTree();
//        Scanner scanner = new Scanner(System.in);
//        tree.populate(scanner);
//        System.out.println(tree.root());

        //Binary Search Tree Concept

        BST bTree = new BST();

        bTree.populate(new int[]{5,4,6,7,3,2});
        bTree.display();
    }
}
