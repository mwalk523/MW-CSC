import java.util.Arrays;

public class MyPQTest {
    public static void main(String[] args) {
        // Create an instance of MyPQ
        MyPQ pq = new MyPQ();

        // Test isEmpty() on an empty heap
        System.out.println("Is the priority queue empty? " + pq.isEmpty());

        // Insert elements into the priority queue
        System.out.println("\nInserting elements into the priority queue:");
        pq.insert(15);
        System.out.println("Priority queue after inserting 15: " + heapToString(pq));
        pq.insert(10);
        System.out.println("Priority queue after inserting 10: " + heapToString(pq));
        pq.insert(20);
        System.out.println("Priority queue after inserting 20: " + heapToString(pq));
        pq.insert(5);
        System.out.println("Priority queue after inserting 5: " + heapToString(pq));
        pq.insert(30);
        System.out.println("Priority queue after inserting 30: " + heapToString(pq));
        pq.insert(25);
        System.out.println("Priority queue after inserting 25: " + heapToString(pq));

        // Test size()
        System.out.println("\nPriority queue size: " + pq.size());

        // Test findMin()
        System.out.println("\nMinimum element: " + pq.findMin());

        // Test deleteMin()
        System.out.println("\nDeleting minimum elements:");
        System.out.println("Deleted: " + pq.deleteMin());
        System.out.println("Priority queue after deleting min: " + heapToString(pq));
        System.out.println("Deleted: " + pq.deleteMin());
        System.out.println("Priority queue after deleting min: " + heapToString(pq));

        // Test makeEmpty()
        System.out.println("\nClearing the priority queue:");
        pq.makeEmpty();
        System.out.println("Priority queue after clearing: " + heapToString(pq));
        System.out.println("Is the priority queue empty? " + pq.isEmpty());
    }

    // Helper method to print the heap as a string
    private static String heapToString(MyPQ pq) {
        return Arrays.toString(Arrays.copyOf(pq.getHeap(), pq.getSize())); // Use getter methods
    }
}