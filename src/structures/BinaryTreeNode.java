package structures;

public class BinaryTreeNode {

    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    private BinaryTreeNode father;

    public BinaryTreeNode(int value, BinaryTreeNode father) {
        this.value = value;
        this.father = father;
        this.left = null;
        this.right = null;
    }

    public int getValue() { return value; }

    public BinaryTreeNode getLeft() { return left; }

    public BinaryTreeNode getRight() { return right; }

    public BinaryTreeNode getFather() { return father; }

    public void setLeft(BinaryTreeNode left) { this.left = left; }

    public void setRight(BinaryTreeNode right) { this.right = right; }

    public void setFather(BinaryTreeNode father) { this.father = father; }
}
