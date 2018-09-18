import structures.CircularLinkedList;
import structures.ListNode;

public class CircularLinkedListPriorityQueue implements PriorityQueue {

    private CircularLinkedList list;

    @Override
    public void enqueue(int number) {
        if (list.getStart() == null) {
            list.insertAtStart(number);
        } else {
            ListNode node = new ListNode(number);
            sortedInsert(node);
        }
    }

    @Override
    public int dequeue() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        } else {
            ListNode node = list.getStart();
            list.deleteAtIndex(0);
            return node.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    private void sortedInsert(ListNode newNode) {
        ListNode current = list.getStart();

        if (current == null) {
            newNode.setNext(newNode);
            list.setStart(newNode);
        } else if (current.getData() >= newNode.getData()) {
            while (current.getNext() != list.getStart()) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(list.getStart());
            list.setStart(newNode);
        } else {
            while (current.getNext() != list.getStart() && current.getNext().getData() < newNode.getData()) {
                current = current.getNext();
            }

            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }
}
