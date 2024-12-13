class BinarySearchTree<T extends Comparable<T>> {
    private INode<T> root;
    private int size;  // Variable to store the size of the tree

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    public void add(T key) {
        root = addRecursive(root, key);
    }

    private INode<T> addRecursive(INode<T> node, T key) {
        if (node == null) {
            size++;  // Increment size when a new node is added
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(addRecursive(node.getLeft(), key));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(addRecursive(node.getRight(), key));
        }

        return node;
    }

    public int size() {
        return size;  // Return the current size of the tree
    }
    public boolean search(T key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(INode<T> node, T key) {
        if (node == null) {
            return false;
        }

        if (key.compareTo(node.getKey()) == 0) {
            return true;
        }

        if (key.compareTo(node.getKey()) < 0) {
            return searchRecursive(node.getLeft(), key);
        } else {
            return searchRecursive(node.getRight(), key);
        }
    }


    public void printInOrder() {
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(INode<T> node) {
        if (node != null) {
            printInOrderRecursive(node.getLeft());
            System.out.print(node.getKey()+" ");
            printInOrderRecursive(node.getRight());
        }
    }
}
