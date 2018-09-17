import structures.BinarySearchTree;

public class BinarySearchTreePriorityQueue implements PriorityQueue {

    private BinarySearchTree binarySearchTree;

    @Override
    public void enqueue(int number) {

    }

    @Override
    public void dequeue() {

    }

    @Override
    public boolean isEmpty() {
        return binarySearchTree.getRoot() == null;
    }
}
