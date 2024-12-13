public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] values = {56, 30, 70, 22, 40, 60, 95, 3, 16, 65, 63, 67};
        for (int value : values) {
            bst.add(value);
        }
        System.out.println("In-order Traversal of BST:");
        bst.printInOrder();
        System.out.println("\nSize of the tree: " + bst.size());
    }
}