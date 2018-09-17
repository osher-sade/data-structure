package structures;

public class CircularLinkedList {
    private ListNode start;
    private ListNode end;
    private int size;

    public CircularLinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void insertAtStart(int value) {
        ListNode node = new ListNode(value, null, null);
        if (start == null) {
            node.setNext(node);
            node.setPrev(node);
            start = node;
            end = start;
        } else {
            node.setPrev(end);
            end.setNext(node);
            start.setPrev(node);
            node.setNext(start);
            start = node;
        }
        size++;
    }

    public void insertAtEnd(int val) {
        ListNode node = new ListNode(val, null, null);
        if (start == null) {
            node.setNext(node);
            node.setPrev(node);
            start = node;
            end = start;
        } else {
            node.setPrev(end);
            end.setNext(node);
            start.setPrev(node);
            node.setNext(start);
            end = node;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index == 1) {
            if (size == 1) {
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getNext();
            start.setPrev(end);
            end.setNext(start);
            size--;
            return;
        }

        if (index == size) {
            end = end.getPrev();
            end.setNext(start);
            start.setPrev(end);
            size--;
            return;
        }

        ListNode ptr = start.getNext();
        for (int i = 2; i <= size; i++) {
            if (i == index) {
                ListNode p = ptr.getPrev();
                ListNode n = ptr.getNext();

                p.setNext(n);
                n.setPrev(p);
                size--;
                return;
            }
            ptr = ptr.getNext();
        }
    }

    public void print() {
        ListNode ptr;
        if (size == 0) {
            System.out.println("empty");
            return;
        }
        if (start.getNext() == start) {
            System.out.println(start.getData() + " ↩ ");
            return;
        }
        System.out.print(start.getData() + " ⇄ ");
        ptr = start.getNext();
        while (ptr.getNext() != start) {
            System.out.print(ptr.getData() + " ⇄ ");
            ptr = ptr.getNext();
        }
        System.out.println(ptr.getData() + " ↩ ");
    }

    public ListNode getStart() {
        return start;
    }

    public ListNode getEnd() {
        return end;
    }

    public int getSize() {
        return size;
    }
}
