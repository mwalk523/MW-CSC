public class MyPQ implements PriorityQueueInt {
    private double[] heap;
    private int size;

    public MyPQ() {
        heap = new double[10]; // Default capacity
        size = 0;
    }

    @Override
    public void insert(double x) {
        if (size == heap.length) {
            growHeap();
        }
        heap[size++] = x;
        percolateUp(size - 1);
    }

    @Override
    public double deleteMin() {
        if (isEmpty()) {
            throw new EmptyPQException("Priority queue is empty.");
        }
        double min = heap[0];
        heap[0] = heap[--size];
        percolateDown(0);
        return min;
    }

    @Override
    public double findMin() {
        if (isEmpty()) {
            throw new EmptyPQException("Priority queue is empty.");
        }
        return heap[0];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void makeEmpty() {
        heap = new double[0]; // Reset the heap to an empty state
        size = 0; // Reset the size to 0    
    }

    // Getter for the heap
    public double[] getHeap() {
        return java.util.Arrays.copyOf(heap, size); // Return a copy of the heap up to the current size
    }

    public int getSize() {
        return size; // Return the current size of the heap
    }

    private void growHeap() {
        heap = java.util.Arrays.copyOf(heap, heap.length * 2);
    }

    private void percolateUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap[index] < heap[parent]) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    private void percolateDown(int index) {
        while (true) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallest = index;

            if (leftChild < size && heap[leftChild] < heap[smallest]) {
                smallest = leftChild;
            }
            if (rightChild < size && heap[rightChild] < heap[smallest]) {
                smallest = rightChild;
            }
            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        double temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
