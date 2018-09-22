package structures;
/*
מגישים :
איתי קליין - 318308053
אושר שדה - 208426213
 */
public class ListNode {

    private int data;
    private ListNode next, prev;

    public ListNode(int data) {
        next = null;
        prev = null;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public ListNode getNext() { return next; }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
