/*
 * Stack Implementation using arrays
 */
 
import java.util.EmptyStackException;
import java.io.*;

// Class ArrayStack implements the DStack interface, defining a LIFO
// stack object with an array as the core object for the data
public class ArrayStack implements DStack 
{
	private double[] stack;
	private int size;	//number of data points in the stack
	
	//creates an empty stack with capacity 10 and size 0
	public ArrayStack () 
   {
		stack = new double[10]; 
		size = 0;
	}
	
	//returns true if the stack does not store any data
	public boolean isEmpty() 
   {
      return size == 0;
 	}

	//inserts a new data point onto the top of the stack
	//if the stack reaches capacity it copies the data
	//	to a new stack with double the capacity
	//increments size (by one each time, no matter capacity change)
	public void push(double d) 
   {
      if (size == stack.length)
      {
         double[] reverseStack = new double[stack.length * 2];
         for (int i = 0; i < size; i++)
         {
            reverseStack[i] = stack[i];
         }
         stack = reverseStack;
      }
      stack[size] = d;
      size++;
 	}

	//removes and returns the latest data point pushed onto
	//the stack that hasn't been removed yet
	//decrements the size
	//throws EmptyStackException if there is no data in the stack
	public double pop() 
   {
      if (isEmpty())
         throw new EmptyStackException();
      double popped = stack[size - 1];
      stack[size - 1] = 0.0;
      size--;
      return popped;
	}

	//returns the latest data point pushed onto the stack
	//that hasn't been removed yet without actually removing it
	//size does not change
	//throws EmptyStackException if there is no data in the stack
	public double peek() 
   {
      double peeked = stack[size - 1];
      return peeked; 
	}
	
	//returns the number of data points in the stack
	public int size() 
   {
      return size;
	}

}
