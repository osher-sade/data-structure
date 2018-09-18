import structures.BinarySearchTree;
import structures.BinaryTreeNode;
import structures.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtEnd(11);
        list.insertAtEnd(22);
        list.insertAtEnd(33);
        list.insertAtStart(44);
        list.print();
        System.out.println("------------------------");
        System.out.println("size: " + list.getSize());
        System.out.println("start: " + list.getStart().getData());
        System.out.println("end: " + list.getEnd().getData());

        //--------------------------------------------------------
        BinarySearchTree tree = new BinarySearchTree(new BinaryTreeNode(3, null));
        tree.Insert(tree.getRoot(), null, 2);
        tree.Insert(tree.getRoot(), null, 6);
        tree.Insert(tree.getRoot(), null, 4);
        tree.Insert(tree.getRoot(), null, 7);
        tree.Insert(tree.getRoot(), null, 5);
        tree.PrintTree(tree.getRoot());
    }
}
