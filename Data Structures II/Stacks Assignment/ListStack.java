/*
 * Stack Implementatin using Linked Lists
 */
 
import java.util.EmptyStackException;

// Class ListStack implements the DStack interface, defining a LIFO
// stack object with a linked list as the core object for the data

public class ListStack implements DStack 
{
	private int size;	//number of data points in the stack
	private ListStackNode front;
	
	//creates an empty stack with size 0
	public ListStack() 
   {
 
 	}
	
	//returns true if the stack does not store any data
	public boolean isEmpty() 
   {
		return front == null;
	}

	//inserts a new data point onto the top of the stack
	//increments the size
	public void push(double d) 
   {
   
 	}
	
	//removes and returns the latest data point pushed onto
	//the stack that hasn't been removed yet
	//decrements the size
	//throws EmptyStackException if there is no data in the stack
	public double pop() 
   {
		// i had to assign a value to avoid system error
      double popped = 0.0;

		return popped;
	}
	
	//returns the latest data point pushed onto the stack
	//that hasn't been removed yet without actually removing it
	//size does not change
	//throws EmptyStackException if there is no data in the stack
	public double peek() 
   {

		return front.data;
	}
	
	//returns the number of data points in the stack
	public int size() 
   {
		return size;
	}
	
	//inner class describing the nodes for the LinkStack
	//each node has a next (ListStackNode) and data (double)
	//not that there is no null constructor
	class ListStackNode 
   {
		public ListStackNode next;
		public double data;
		
		// constructs a new ListStackNode, requires the feilds be filled
		public ListStackNode(double data, ListStackNode next) 
      {
			this.data = data;
			this.next = next;
		}
	}
}
