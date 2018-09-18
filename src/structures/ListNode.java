package structures;

public class ListNode {
    private int data;
    private ListNode next, prev;

    public ListNode() {
        next = null;
        prev = null;
        data = 0;
    }

    public ListNode(int data) {
        next = null;
        prev = null;
        this.data = data;
    }

    public ListNode(int data, ListNode next, ListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

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
