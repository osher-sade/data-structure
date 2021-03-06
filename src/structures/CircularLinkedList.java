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

    public void insert(int number) {
        ListNode nptr = new ListNode(number);
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

    public void delete() {
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
