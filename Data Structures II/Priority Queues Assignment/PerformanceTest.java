import java.util.Random;

public class PerformanceTest {
    public static void main(String[] args) {
        int[] testSizes = {1000, 5000, 10000, 50000, 100000};
        System.out.println("Performance Test Results (Time in milliseconds):");

        for (int n : testSizes) {
            System.out.println("\nNumber of operations: " + n);

            System.out.println("BinaryHeap: " + measurePerformance(new BinaryHeap(), n) + " ms");
            System.out.println("ThreeHeap: " + measurePerformance(new ThreeHeap(), n) + " ms");
            System.out.println("MyPQ: " + measurePerformance(new MyPQ(), n) + " ms");
        }
    }

    private static long measurePerformance(PriorityQueueInt pq, int n) {
        Random random = new Random();
        long startTime, endTime;

        // Measure insertion time
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            pq.insert(random.nextDouble());
        }
        endTime = System.nanoTime();
        long insertionTime = endTime - startTime;

        return insertionTime / 1_000_000; // Convert nanoseconds to milliseconds
    }
}

// PriorityQueue interface for compatibility
public interface PriorityQueueInt {
    void insert(double x);
    double deleteMin();
    double findMin();
    boolean isEmpty();
    int size();
}

public class BinaryHeap implements PriorityQueueInt {
    // Implementation of BinaryHeap
}

public class ThreeHeap implements PriorityQueueInt {
    // Implementation of ThreeHeap
}

public class MyPQ implements PriorityQueueInt {
    // Implementation of MyPQ
}
