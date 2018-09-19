public class Main {
    public static void main(String[] args) {
        CircularLinkedListPriorityQueue listPriorityQueue = new CircularLinkedListPriorityQueue();
        BinarySearchTreePriorityQueue treePriorityQueue = new BinarySearchTreePriorityQueue();
        System.out.println("The random generated numbers are: ");
        for (int i = 0; i < 50; i++) {
            int number = (int) (Math.random() * 1000 + 1);
            System.out.println(number);
            listPriorityQueue.enqueue(number);
            treePriorityQueue.enqueue(number);
        }

        System.out.println("---------------------------------------------------");

        System.out.println("CircularLinkedListPriorityQueue dequeued numbers: ");
        while (!listPriorityQueue.isEmpty()) {
            try {
                System.out.println(listPriorityQueue.dequeue());
            } catch (PriorityQueue.UnderflowException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("---------------------------------------------------");

        System.out.println("BinarySearchTreePriorityQueue dequeued numbers: ");
        while (!treePriorityQueue.isEmpty()) {
            try {
                System.out.println(treePriorityQueue.dequeue());
            } catch (PriorityQueue.UnderflowException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
