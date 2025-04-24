import java.util.Arrays;

/**
 * ThreeHeap implementation of PriorityQueueInt.
 */
public class ThreeHeapTest implements PriorityQueueInt {

    private double[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ThreeHeapTest() {
        this(DEFAULT_CAPACITY);
    }

    public ThreeHeapTest(int initialCapacity) {
        array = new double[initialCapacity];
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public double findMin() {
        if (isEmpty()) {
            throw new EmptyPQException();
        }
        return array[0];
    }

    @Override
    public void insert(double x) {
        if (size == array.length) {
            growArray();
        }
        array[size++] = x;
        percolateUp(size - 1);
    }

    @Override
    public double deleteMin() {
        if (isEmpty()) {
            throw new EmptyPQException();
        }
        double min = array[0];
        array[0] = array[--size];
        percolateDown(0);
        return min;
    }

    @Override
    public void makeEmpty() {
        size = 0;
    }

    private void growArray() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    private void percolateUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 3;
            if (array[index] < array[parentIndex]) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void percolateDown(int index) {
        while (true) {
            int minChildIndex = -1;
            double minChild = Double.MAX_VALUE;
            for (int i = 1; i <= 3; i++) {
                int childIndex = 3 * index + i;
                if (childIndex < size && array[childIndex] < minChild) {
                    minChild = array[childIndex];
                    minChildIndex = childIndex;
                }
            }

            if (minChildIndex != -1 && array[index] > array[minChildIndex]) {
                swap(index, minChildIndex);
                index = minChildIndex;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Static inner class for EmptyPQException
    public static class EmptyPQException extends RuntimeException {
        public EmptyPQException() {
            super("Priority queue is empty.");
        }
    }

    public static void main(String[] args) {
        // Create a ThreeHeapTest instance
        ThreeHeapTest heap = new ThreeHeapTest();

        // Test isEmpty() on an empty heap
        System.out.println("Is the heap empty? " + heap.isEmpty());

        // Insert elements into the heap
        System.out.println("\nInserting elements into the heap:");
        heap.insert(15);
        System.out.println("Heap after inserting 15: " + Arrays.toString(heap.array));
        heap.insert(10);
        System.out.println("Heap after inserting 10: " + Arrays.toString(heap.array));
        heap.insert(20);
        System.out.println("Heap after inserting 20: " + Arrays.toString(heap.array));
        heap.insert(5);
        System.out.println("Heap after inserting 5: " + Arrays.toString(heap.array));
        heap.insert(30);
        System.out.println("Heap after inserting 30: " + Arrays.toString(heap.array));
        heap.insert(25);
        System.out.println("Heap after inserting 25: " + Arrays.toString(heap.array));

        // Test size()
        System.out.println("\nHeap size: " + heap.size());

        // Test findMin()
        System.out.println("Minimum element: " + heap.findMin());
    }
}
