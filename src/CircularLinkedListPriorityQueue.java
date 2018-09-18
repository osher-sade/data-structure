import structures.CircularLinkedList;

public class CircularLinkedListPriorityQueue implements PriorityQueue {

    private CircularLinkedList list;

    @Override
    public void enqueue(int number) {
        if (list.getStart() == null) {
            list.insertAtStart(number);
        } else {
            list.insertAtEnd(number);
        }
    }

    @Override
    public int dequeue() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        } else {
            return 0;
        }
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
