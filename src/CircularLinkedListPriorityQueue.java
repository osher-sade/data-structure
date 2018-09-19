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
        ListNode tmp, ptr;
        boolean insert = false;
        if (list.getStart() == null) {
            newNode.setNext(newNode);
            newNode.setPrev(newNode);
            list.setStart(newNode);
            list.setEnd(newNode);
        } else if (newNode.getData() >= list.getStart().getData()) {
            newNode.setPrev(list.getEnd());
            list.getEnd().setNext(newNode);
            list.getStart().setPrev(newNode);
            newNode.setNext(list.getStart());
            list.setStart(newNode);
        } else if (newNode.getData() <= list.getEnd().getData()) {
            list.getEnd().setNext(newNode);
            newNode.setPrev(list.getEnd());
            newNode.setNext(list.getStart());
            list.getStart().setPrev(newNode);
            list.setEnd(newNode);
        } else {
            tmp = list.getStart();
            ptr = list.getStart().getNext();
            while (ptr != null) {
                if (newNode.getData() <= tmp.getData() && newNode.getData() >= ptr.getData()) {
                    tmp.setNext(newNode);
                    newNode.setPrev(tmp);
                    newNode.setNext(ptr);
                    ptr.setPrev(newNode);
                    insert = true;
                    break;
                } else {
                    tmp = ptr;
                    ptr = ptr.getNext();
                }
            }
            if (!insert) {
                tmp.setNext(newNode);
                newNode.setPrev(tmp);
            }
        }
        list.setSize(list.getSize() + 1);
    }

    public void print() {
        list.print();
    }
}
