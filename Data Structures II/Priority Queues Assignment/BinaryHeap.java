import java.util.ArrayList;

public class BinaryHeap implements PriorityQueueInt {
    private ArrayList<Double> heap;

    public BinaryHeap() {
        heap = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return heap.size() == 0; // Check if the heap is empty
    }

    @Override
    public int size() {
        return heap.size(); // Return the size of the heap
    }

    @Override
    public double findMin() {
        if (isEmpty()) {
            throw new EmptyPQException("Priority queue is empty."); // Throw EmptyPQException if empty
        }
        return heap.get(0); // Return the minimum element
    }

    @Override
    public void insert(double x) {
        heap.add(x); // Add the element to the heap
        percolateUp(heap.size() - 1); // Restore the heap property
    }

    @Override
    public double deleteMin() {
        if (isEmpty()) {
            throw new EmptyPQException("Priority queue is empty."); // Throw EmptyPQException if empty
        }
        double min = heap.get(0); // Get the minimum element
        if (heap.size() == 1) {
            heap.remove(0); // If only one element, remove it
        } else {
            heap.set(0, heap.remove(heap.size() - 1)); // Replace root with the last element
            percolateDown(0); // Restore the heap property
        }
        return min; // Return the minimum element
    }

    @Override
    public void makeEmpty() {
        heap.clear(); // Clear the heap
    }

    private void percolateUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2; // Calculate the parent index
            if (heap.get(index) < heap.get(parent)) {
                swap(index, parent); // Swap with the parent if necessary
                index = parent; // Move up to the parent
            } else {
                break; // Stop if the heap property is satisfied
            }
        }
    }

    private void percolateDown(int index) {
        int size = heap.size();
        while (index * 2 + 1 < size) { // While there is at least one child
            int leftChild = index * 2 + 1;
            int rightChild = index * 2 + 2;
            int smallest = leftChild;

            if (rightChild < size && heap.get(rightChild) < heap.get(leftChild)) {
                smallest = rightChild; // Choose the smaller child
            }

            if (heap.get(index) > heap.get(smallest)) {
                swap(index, smallest); // Swap with the smaller child
                index = smallest; // Move down to the child
            } else {
                break; // Stop if the heap property is satisfied
            }
        }
    }

    private void swap(int i, int j) {
        double temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp); // Swap two elements in the heap
    }
}