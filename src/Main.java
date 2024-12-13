public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] values = {56, 30, 70, 22, 40, 60, 95, 3, 16, 65, 63, 67};
        for (int value : values) {
            bst.add(value);
        }
        System.out.println("In-order Traversal of BST:");
        bst.printInOrder();

        int searchKey = 63;
        if (bst.search(searchKey)) {
            System.out.println("\n" + searchKey + " found in the BST.");
        } else {
            System.out.println("\n" + searchKey + " not found in the BST.");
        }

        System.out.println("\nSize of the tree: " + bst.size());
    }
}