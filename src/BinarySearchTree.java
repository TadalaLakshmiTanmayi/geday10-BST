class BinarySearchTree<T extends Comparable<T>> {
    private INode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void add(T key) {
        root = addRecursive(root, key);
    }

    private INode<T> addRecursive(INode<T> node, T key) {
        if (node == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(addRecursive(node.getLeft(), key));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(addRecursive(node.getRight(), key));
        }

        return node;
    }

    public void printInOrder() {
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(INode<T> node) {
        if (node != null) {
            printInOrderRecursive(node.getLeft());
            System.out.println(node.getKey());
            printInOrderRecursive(node.getRight());
        }
    }
}
