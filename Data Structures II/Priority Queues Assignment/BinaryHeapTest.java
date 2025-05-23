/*
 * Testing program for Binary Heap.
 */

import java.util.*;
import java.util.ArrayList;

public class BinaryHeapTest {
	
	public static void main(String[] args) 
	{
		BinaryHeap testBinaryHeap = new BinaryHeap();
		
		double[] testData1 = new double[0];
		double[] testData2 = new double[2];
		double[] testData3 = new double[3];
		double[] testData4 = new double[8];
		double[] testData5 = new double[91];
		
		for (int i = 0; i < testData2.length; i++)
			testData2[i] = 100* Math.random();
		for (int i = 0; i < testData3.length; i++)
			testData3[i] = 100* Math.random();
		for (int i = 0; i < testData4.length; i++)
			testData4[i] = 100* Math.random();
		for (int i = 0; i < testData5.length; i++)
			testData5[i] = 100* Math.random();
		
		double[] sortedData2 = testData2;
		Arrays.sort(testData2);
		double[] sortedData3 = testData3;
		Arrays.sort(testData3);
		double[] sortedData4 = testData4;
		Arrays.sort(testData4);
		double[] sortedData5 = testData5;
		Arrays.sort(testData5);
		
		double[][] testData = {testData1, testData2, testData3, testData4, testData5};
		double[][] sortedData = {testData1, sortedData2, sortedData3, sortedData4, sortedData5};
			
		// constructor tests
		System.out.println("Starting constructor test...");
		testConstructor(testBinaryHeap);
		System.out.println("Constructor test passed!");
		
		// test 1
		System.out.println("Starting test 1...");
		test1(testBinaryHeap, testData, sortedData);
		System.out.println("Test 1 passed!\n");
		
		// test 2
		System.out.println("Starting test 2...");
		test1(testBinaryHeap, testData, sortedData);
		System.out.println("Test 2 passed!\n");
		
	}

	// pre: priority queue passed has been just constructed, with no methods called on it yet
	// post: checks to make sure priority queue was constructed properly
   public static void testConstructor(BinaryHeap genericHeap)
   {
		System.out.println("		Checking if priority queue is empty...");
		if (genericHeap.isEmpty())
			System.out.println("		...passed");
		else
		{
			System.out.println("		...failed");
			System.out.println("		Priority queue should be empty when constructed.");
			System.exit(1);
		}
		System.out.println("		Checking if size is zero...");
		if (genericHeap.size() == 0)
			System.out.println("		...passed");
		else
		{
			System.out.println("		...failed");
			System.out.println("		Size of priority queue should be zero when constructed");
			System.exit(1);
		}
		System.out.println("		Checking deleteMin() call and catching exception");
    	try
		{
    		genericHeap.deleteMin();
		}
    	catch (EmptyPQException e)
    	{
    		System.out.println("		...passed");
    	}
   }

   // this test will push random values into priority queue, deleteMin the same amount of times,
   // peeking to see if the right value is at top of queue each time,
   // and then check if the queues are empty when we remove all values
   public static void test1(BinaryHeap genericHeap, double[][] testData, double[][] sortedData)
   {
      for (int i = 0; i < testData.length; i++)
    	{
    		System.out.println("		Starting test for testData" + (i + 1));
    		for (int j = 0; j < testData[i].length; j++) 
    			genericHeap.insert(testData[i][j]);

			System.out.println("	Heap size: " + genericHeap.size());

    		for (int j = 0; j < testData[i].length; j++)
    		{
        		try 
        		{
        			if (genericHeap.findMin() != sortedData[i][j])
        			{
        				System.out.println("		...minimum value is not at top of queue");
        				System.exit(1);
        			}
        			genericHeap.deleteMin();
        		} 
        		catch (Exception e)
        		{
                    System.out.println("		...failed when removing min value from queue");
                    System.out.println("        threw exception: " + e);
                    System.exit(1);
        		}
        	}
    		System.out.println("		checking if priority queue is empty");
    	 	if (!genericHeap.isEmpty())
    	 	{
        		System.out.println("		...failed when checking if priority queue is empty");	
        		System.exit(1);
        	} 
    	 	else 
        		System.out.println("		...passed");
    		System.out.println("		Test passed for testData" + (i + 1));
    	}
    	
   }
    
   // this test will push some values onto queue and then do some deleteMin calls, testing to see if the minimum value
   // is removed from priority queue, then checks if the queue is empty when finished. Also checks to see the appropriate size
   // of the queue once all values are added to pQueue
   public static void test2(BinaryHeap genericHeap, double[][] testData, double[][] sortedData)
   {
    	for (int i = 0; i < testData.length; i++)
    	{
    		System.out.println("		Starting test for testData" + (i + 1));
    		for (int j = 0; j < testData[i].length; j++) 
    			genericHeap.insert(testData[i][j]);
    		if (genericHeap.size() != testData[i].length)
    		{
    			System.out.println("		size and number of elements do not match");
    			System.exit(1);
    		}
    		for (int j = 0; j < testData[i].length; j++)
    		{
        		try 
        		{
        			double value = genericHeap.deleteMin();
        			if (value != sortedData[i][j])
        			{
        				System.out.println("		...failed, min value wasn't removed from priority queue");
        				System.exit(1);
        			}
        		} 
        		catch (Exception e)
        		{
                    System.out.println("		...failed when removing min value from queue");
                    System.out.println("        threw exception: " + e);
                    System.exit(1);
        		}
        	}
    		System.out.println("		checking if priority queue is empty");
    	 	if (!genericHeap.isEmpty())
    	 	{
        		System.out.println("		...failed when checking if priority queue is empty");	
        		System.exit(1);
        	} 
    	 	else 
        		System.out.println("		...passed");
    		System.out.println("		Test passed for testData" + (i + 1));
    	} 	
   }
}

class EmptyPQException extends RuntimeException {
    public EmptyPQException(String message) {
        super(message);
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

class BinaryHeap implements PriorityQueueInt {
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
