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
}
