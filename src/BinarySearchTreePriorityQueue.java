import structures.BinarySearchTree;
import structures.BinaryTreeNode;

public class BinarySearchTreePriorityQueue implements PriorityQueue {

    //Data Members
    private BinarySearchTree binarySearchTree;

    //Constructor
    public BinarySearchTreePriorityQueue() { this.binarySearchTree = new BinarySearchTree(); }

    @Override
    public void enqueue(int number) {
        this.binarySearchTree.setRoot(this.binarySearchTree.Insert(this.binarySearchTree.getRoot(), null, number));
    }

    @Override
    public int dequeue() throws UnderflowException {
        if(isEmpty()){
            throw new UnderflowException();
        }

        BinaryTreeNode currentNode = this.binarySearchTree.getRoot();

        while(currentNode.getRight() != null)
            currentNode = currentNode.getRight();

        if(currentNode.getFather() == null)
            this.binarySearchTree.setRoot(currentNode.getLeft());
        else
            currentNode.getFather().setRight(currentNode.getLeft());

        if(currentNode.getLeft() != null)
            currentNode.getLeft().setFather(currentNode.getFather());

        return currentNode.getValue();
    }

    @Override
    public boolean isEmpty() { return binarySearchTree.IsEmpty(); }
}
