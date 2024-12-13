class MyBinaryNode<T extends Comparable<T>> implements INode<T> {
    private T key;
    private INode<T> left;
    private INode<T> right;

    public MyBinaryNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public INode<T> getLeft() {
        return left;
    }

    public void setLeft(INode<T> left) {
        this.left = left;
    }

    public INode<T> getRight() {
        return right;
    }

    public void setRight(INode<T> right) {
        this.right = right;
    }
}