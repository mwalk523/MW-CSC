import java.util.Random;

public class PQTimer {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};
        for (int N : sizes) {
            PriorityQueueInt binaryHeap = new BinaryHeap();
            PriorityQueueInt threeHeap = new ThreeHeap();
            PriorityQueueInt myPQ = new MyPQ();
            
            // Fill each queue with N random values
            Random random = new Random();
            for (int i = 0; i < N; i++) {
                double value = random.nextDouble() * N; // Generate random doubles
                binaryHeap.insert(value);
                threeHeap.insert(value);
                myPQ.insert(value);
            }

            // Time deleteMin operations
            long binaryStart = System.nanoTime();
            for (int i = 0; i < N; i++) {
                binaryHeap.deleteMin();
            }
            long binaryEnd = System.nanoTime();

            long threeStart = System.nanoTime();
            for (int i = 0; i < N; i++) {
                threeHeap.deleteMin();
            }
            long threeEnd = System.nanoTime();

            long myPQStart = System.nanoTime();
            for (int i = 0; i < N; i++) {
                myPQ.deleteMin();
            }
            long myPQEnd = System.nanoTime();

            System.out.println("N=" + N);
            System.out.println("BinaryHeap Time: " + (binaryEnd - binaryStart) / 1e6 + " ms");
            System.out.println("ThreeHeap Time: " + (threeEnd - threeStart) / 1e6 + " ms");
            System.out.println("MyPQ Time: " + (myPQEnd - myPQStart) / 1e6 + " ms");
            System.out.println("--------------------");
        }
    }
}