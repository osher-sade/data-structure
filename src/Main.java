public class Main {
    public static void main(String[] args) {
        CircularLinkedListPriorityQueue listPriorityQueue = new CircularLinkedListPriorityQueue();
        BinarySearchTreePriorityQueue treePriorityQueue = new BinarySearchTreePriorityQueue();
        for(int i = 0; i < 50; i++)
        {
            int number = (int)(Math.random() * 1000 + 1);
            System.out.println("the random number is : " + number);
            listPriorityQueue.enqueue(number);
            treePriorityQueue.enqueue(number);
        }

        while(!listPriorityQueue.isEmpty())
        {
            try {
                System.out.println(listPriorityQueue.dequeue() + ", ");
            } catch (PriorityQueue.UnderflowException e) {
                e.printStackTrace();
            }
        }

        while(!treePriorityQueue.isEmpty())
        {
            try {
                System.out.println(treePriorityQueue.dequeue() + ", ");
            } catch (PriorityQueue.UnderflowException e) {
                e.printStackTrace();
            }
        }
    }
}
