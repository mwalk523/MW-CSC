/*
 * Testing program for ThreeHeap.
 */

import java.util.ArrayList;

public class ThreeHeapToString {
    public static void main(String[] args) {
        ThreeHeap testHeap = new ThreeHeap();

        // Insert elements into the heap
        add(testHeap, 105);
        add(testHeap, 15);
        add(testHeap, 43);
        add(testHeap, 12);
        add(testHeap, 10);
        add(testHeap, 5);
        add(testHeap, 58);
        add(testHeap, 40);

        // Remove elements from the heap
        remove(testHeap);
        remove(testHeap);
        remove(testHeap);
        remove(testHeap);
        remove(testHeap);
        remove(testHeap);
        remove(testHeap);
        remove(testHeap);
    }

    public static void add(ThreeHeap heap, double value) {
        System.out.println("Inserting: " + value);
        heap.insert(value);
        System.out.println("Heap after insertion: " + heap.toString());
    }

    public static void remove(ThreeHeap heap) {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty. Cannot remove.");
            return;
        }
        double min = heap.deleteMin();
        System.out.println("Removed minimum: " + min);
        System.out.println("Heap after removal: " + heap.toString());
    }
}

interface PriorityQueueInt {
    boolean isEmpty();
    int size();
    double findMin();
    void insert(double x);
    double deleteMin();
    void makeEmpty();
}

class ThreeHeap implements PriorityQueueInt {
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
        return heap.get(0);
    }

    @Override
    public void insert(double x) {
        heap.add(x);
        percolateUp(heap.size() - 1);
    }

    @Override
    public double deleteMin() {
        if (isEmpty()) {
            throw new EmptyPQException("Priority queue is empty.");
        }
        double min = heap.get(0);
        if (heap.size() == 1) {
            heap.remove(0);
        } else {
            heap.set(0, heap.remove(heap.size() - 1));
            percolateDown(0);
        }
        return min;
    }

    @Override
    public void makeEmpty() {
        heap.clear();
    }

    private void percolateUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 3;
            if (heap.get(index) < heap.get(parent)) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    private void percolateDown(int index) {
        int size = heap.size();
        while (index * 3 + 1 < size) {
            int firstChild = index * 3 + 1;
            int secondChild = index * 3 + 2;
            int thirdChild = index * 3 + 3;
            int smallest = firstChild;

            if (secondChild < size && heap.get(secondChild) < heap.get(smallest)) {
                smallest = secondChild;
            }
            if (thirdChild < size && heap.get(thirdChild) < heap.get(smallest)) {
                smallest = thirdChild;
            }

            if (heap.get(index) > heap.get(smallest)) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        double temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}

class EmptyPQException extends RuntimeException {
    public EmptyPQException(String message) {
        super(message);
    }
}
