package structures;
/*
מגישים :
איתי קליין - 318308053
אושר שדה - 208426213
 */
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
