/*
מגישים :
איתי קליין - 318308053
אושר שדה - 208426213
 */
public class Main {
    public static void main(String[] args) {
        CircularLinkedListPriorityQueue listPriorityQueue = new CircularLinkedListPriorityQueue();
        BinarySearchTreePriorityQueue treePriorityQueue = new BinarySearchTreePriorityQueue();

        System.out.println("Is CircularLinkedListPriorityQueue empty? " + listPriorityQueue.isEmpty());
        System.out.println("Is BinarySearchTreePriorityQueue empty? " + treePriorityQueue.isEmpty());

        System.out.println("---------------------------------------------------");

        System.out.println("The random generated numbers that are being enqueued are: ");
        for (int i = 0; i < 5; i++) {
            int number = (int) (Math.random() * 1000 + 1);
            System.out.print(number + ", ");
            listPriorityQueue.enqueue(number);
            treePriorityQueue.enqueue(number);
        }

        System.out.println("\n---------------------------------------------------");

        System.out.println("Is CircularLinkedListPriorityQueue empty? " + listPriorityQueue.isEmpty());
        System.out.println("Is BinarySearchTreePriorityQueue empty? " + treePriorityQueue.isEmpty());

        System.out.println("---------------------------------------------------");

        System.out.println("CircularLinkedListPriorityQueue dequeued numbers: ");
        while (!listPriorityQueue.isEmpty()) {
            try {
                System.out.print(listPriorityQueue.dequeue() + ", ");
            } catch (PriorityQueue.UnderflowException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n---------------------------------------------------");

        System.out.println("BinarySearchTreePriorityQueue dequeued numbers: ");
        while (!treePriorityQueue.isEmpty()) {
            try {
                System.out.print(treePriorityQueue.dequeue() + ", ");
            } catch (PriorityQueue.UnderflowException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n---------------------------------------------------");

        System.out.println("Is CircularLinkedListPriorityQueue empty? " + listPriorityQueue.isEmpty());
        System.out.println("Is BinarySearchTreePriorityQueue empty? " + treePriorityQueue.isEmpty());
    }
}
