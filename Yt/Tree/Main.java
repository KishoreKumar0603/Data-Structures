package Yt.Tree;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {10, 5, 15, 2, 7, 12, 20};
        for (int v : values) {
            tree.root = tree.insert(tree.root, v);
        }

        System.out.println("Inorder Traversal:");
        tree.inOrder(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preOrder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postOrder(tree.root);

        // Deletion
        System.out.println("\n\nDeleting 5...");
        tree.root = tree.delete(tree.root, 5);

        System.out.println("Inorder After Deletion:");
        tree.inOrder(tree.root);
    }
}
