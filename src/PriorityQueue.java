public interface PriorityQueue {

    void enqueue(int number);

    int dequeue() throws UnderflowException;

    boolean isEmpty();

    class UnderflowException extends Exception {
        UnderflowException() {
            super("Can't dequeue from an empty queue!");
        }
    }
}
