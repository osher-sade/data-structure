import structures.BinarySearchTree;

public class BinarySearchTreePriorityQueue implements PriorityQueue {

    //Data Members
    private BinarySearchTree binarySearchTree;

    @Override
    public void enqueue(int number) {
        binarySearchTree.setRoot(binarySearchTree.Insert(binarySearchTree.getRoot(), null, number));
    }

    @Override
    public int dequeue() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return binarySearchTree.getRoot() == null;
    }
}
