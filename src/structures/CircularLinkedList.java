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

    public void insertAtStart(int number) {
        ListNode nptr = new ListNode(number, null, null);
        if (start == null) {
            nptr.setNext(nptr);
            nptr.setPrev(nptr);
            start = nptr;
            end = start;
        } else {
            nptr.setPrev(end);
            end.setNext(nptr);
            start.setPrev(nptr);
            nptr.setNext(start);
            start = nptr;
        }
        size++;
    }

    public void insertAtPosition(int number, int position) {
        ListNode nptr = new ListNode(number, null, null);
        if (position == 1) {
            insertAtStart(number);
            return;
        }
        ListNode ptr = start;
        for (int i = 2; i <= size; i++) {
            if (i == position) {
                ListNode temp = ptr.getNext();
                ptr.setNext(nptr);
                nptr.setPrev(ptr);
                nptr.setNext(temp);
                temp.setPrev(nptr);
            }
            ptr = ptr.getNext();
        }
        size++;
    }

    public void deleteAtPosition(int position) {
        if (position == 1) {
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

        if (position == size) {
            end = end.getPrev();
            end.setNext(start);
            start.setPrev(end);
            size--;
            return;
        }

        ListNode ptr = start.getNext();
        for (int i = 2; i <= size; i++) {
            if (i == position) {
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

    public void setStart(ListNode start) {
        this.start = start;
    }

    public void setEnd(ListNode end) {
        this.end = end;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
