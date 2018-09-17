package structures;

public class BinaryTreeNode {

    //Data Members
    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    private BinaryTreeNode father;

    //Constructor
    public BinaryTreeNode(int value, BinaryTreeNode father) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.father = null;
    }

    //Getters
    public int getValue() { return value; }

    public BinaryTreeNode getLeft() { return left; }

    public BinaryTreeNode getRight() { return right; }

    public BinaryTreeNode getFather() { return father; }

    //Setters
    public void setValue(int value) { this.value = value; }

    public void setLeft(BinaryTreeNode left) { this.left = left; }

    public void setRight(BinaryTreeNode right) { this.right = right; }

    public void setFather(BinaryTreeNode father) { this.father = father; }
}
