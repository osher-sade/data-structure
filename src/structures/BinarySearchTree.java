package structures;
/*
מגישים :
איתי קליין - 318308053
אושר שדה - 208426213
 */
public class BinarySearchTree {

    private BinaryTreeNode root;

    public BinarySearchTree() { }

    public BinaryTreeNode getRoot() { return root; }

    public void setRoot(BinaryTreeNode root) { this.root = root; }

    public BinaryTreeNode Insert(BinaryTreeNode currentNode, BinaryTreeNode father, int value)
    {
        if(currentNode == null) {
            return new BinaryTreeNode(value, father);
        }

        if (value <= currentNode.getValue()) {
            currentNode.setLeft(Insert(currentNode.getLeft(), currentNode, value));
        } else if (value > currentNode.getValue()) {
            currentNode.setRight(Insert(currentNode.getRight(), currentNode, value));
        }

        return currentNode;
    }

    public boolean IsEmpty() { return this.root == null; }
}
