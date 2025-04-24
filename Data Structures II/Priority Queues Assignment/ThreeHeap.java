import java.util.ArrayList;

public class ThreeHeap implements PriorityQueueInt {
    private ArrayList<Double> heap;

    public ThreeHeap() {
        heap = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public double findMin() {
        if (isEmpty()) {
            throw new EmptyPQException("Priority queue is empty.");
        }
        return heap.get(0); // The minimum element is always at the root
    }

    @Override
    public void insert(double x) {
        heap.add(x); // Add the new element to the end of the array
        percolateUp(heap.size() - 1); // Restore the heap property
    }

    @Override
    public double deleteMin() {
        if (isEmpty()) {
            throw new EmptyPQException("Priority queue is empty.");
        }
        double min = heap.get(0); // The minimum element is at the root
        if (heap.size() == 1) {
            heap.remove(0); // If there's only one element, just remove it
        } else {
            heap.set(0, heap.remove(heap.size() - 1)); // Replace root with the last element
            percolateDown(0); // Restore the heap property
        }
        return min;
    }

    @Override
    public void makeEmpty() {
        heap.clear(); // Clear the heap
    }

    private void percolateUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 3; // Calculate the parent index for a 3-ary heap
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
        while (index * 3 + 1 < size) { // While there is at least one child
            int firstChild = index * 3 + 1;
            int secondChild = index * 3 + 2;
            int thirdChild = index * 3 + 3;
            int smallest = firstChild;

            // Find the smallest child
            if (secondChild < size && heap.get(secondChild) < heap.get(smallest)) {
                smallest = secondChild;
            }
            if (thirdChild < size && heap.get(thirdChild) < heap.get(smallest)) {
                smallest = thirdChild;
            }

            // Swap with the smallest child if necessary
            if (heap.get(index) > heap.get(smallest)) {
                swap(index, smallest);
                index = smallest; // Move down to the smallest child
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

    @Override
    public String toString() {
        return heap.toString(); // Return a string representation of the heap
    }
}
