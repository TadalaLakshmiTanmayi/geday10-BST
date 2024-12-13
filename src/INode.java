interface INode<T> {
    T getKey();
    void setKey(T key);
    INode<T> getLeft();
    void setLeft(INode<T> left);
    INode<T> getRight();
    void setRight(INode<T> right);
}