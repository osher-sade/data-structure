package structures;

public class BinarySearchTree {

    // Data Members
    private BinaryTreeNode root;

    //Constructor
    public BinarySearchTree() { }

    //Getters
    public BinaryTreeNode getRoot() { return root; }

    //Setters
    public void setRoot(BinaryTreeNode root) { this.root = root; }

    //Public Methods
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

    private void PrintTree(BinaryTreeNode node)
    {
        if (node != null) {
            PrintTree(node.getRight());
            System.out.print(" " + node.getValue());
            PrintTree(node.getLeft());
        }
    }
}
