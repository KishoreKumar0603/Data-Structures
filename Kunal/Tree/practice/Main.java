package Kunal.Tree.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner scanner = new Scanner(System.in);
        tree.insert(scanner);

        int i = 0;
        do {
            int choice;
            System.out.println("1.InOrder\n2.PostOrder\n3.PreOrder");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    tree.inOrder(tree.root);break;
                case 2:
                    tree.postOrder(tree.root);break;
                case 3:
                    tree.preOrder(tree.root);break;
            }
            System.out.println("Another Traversal ( true -> 0 or false -> 1 ) : ");
            i = scanner.nextInt();

        } while (i == 0);

    }
}
