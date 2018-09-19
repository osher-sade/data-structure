import structures.CircularLinkedList;
import structures.ListNode;

public class CircularLinkedListPriorityQueue implements PriorityQueue {

    private CircularLinkedList list;

    public CircularLinkedListPriorityQueue() {
        list = new CircularLinkedList();
    }

    @Override
    public void enqueue(int number) {
        if (list.getStart() == null) {
            list.insertAtStart(number);
        } else {
            ListNode node = new ListNode(number);
            sortedInsert(node);
            list.setSize(list.getSize() + 1);
        }
    }

    @Override
    public int dequeue() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        } else {
            ListNode node = list.getStart();
            list.deleteAtPosition(1);
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
//            newNode.setPrev(newNode);
            list.setStart(newNode);
        } else if (current.getData() < newNode.getData()) {
            while (current.getNext() != list.getStart()) {
                current = current.getNext();
            }
            current.setNext(newNode);
//            newNode.setPrev(current);
            newNode.setNext(list.getStart());
            list.setStart(newNode);
//            list.getStart().setPrev(newNode);
        } else {
            while (current.getNext() != list.getStart() && current.getNext().getData() >= newNode.getData()) {
                current = current.getNext();
            }

            newNode.setNext(current.getNext());
            //current.getNext().setPrev(newNode);
            current.setNext(newNode);
        }
    }

    public void print() {
        list.print();
    }
}
