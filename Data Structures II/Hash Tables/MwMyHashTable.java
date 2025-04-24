/*
 * This class is a Hash Table that implements the StringCounter interface.
 */
public class MyHashTable implements StringCounter
{

   // Add these fields at the top of the class
   private static final int INITIAL_CAPACITY = 10007; // Initial size of the hash table (prime number)
   private StringCount[] table; // Array to store string-count pairs
   private int size; // Number of unique strings in the hash table

   // Initialize the hash table in the constructor
   public MyHashTable() {
       table = new StringCount[INITIAL_CAPACITY];
       size = 0;
   }

   // Hash function to compute the index for a given string
   private int hash(String s) {
       int hashValue = 0;
       for (int i = 0; i < s.length(); i++) {
           hashValue = (31 * hashValue + s.charAt(i)) % table.length;
       }
       return Math.abs(hashValue);
   }

	// IncCount increments the count for a particular string
	@Override
	public void IncCount(String s) {
	    int index = hash(s);

	    // Linear probing to handle collisions
	    while (table[index] != null) {
	        if (table[index].str.equals(s)) {
	            table[index].cnt++; // Increment count if string is found
	            return;
	        }
	        index = (index + 1) % table.length; // Move to the next index
	    }

	    // If the string is not found, add a new StringCount object
	    table[index] = new StringCount(s, 1);
	    size++;

	    // Resize the table if the load factor exceeds 0.75
	    if ((double) size / table.length > 0.75) {
	        resize();
	    }
	}

	// Resize the hash table when the load factor exceeds 0.75
	private void resize() {
	    StringCount[] oldTable = table;
	    table = new StringCount[nextPrime(2 * oldTable.length)];
	    size = 0;

	    for (StringCount sc : oldTable) {
	        if (sc != null) {
	            IncCount(sc.str); // Rehash all existing elements
	        }
	    }
	}

	// GetSize returns the number of strings
	public int GetSize() 
	{
		return size;
	}

	// GetCounts returns an array of all the string-count pairs
	// in the dictionary, sorted lexicographically by strings.
	// We've defined a StringCount container class
	// above to store the String-int pairs.
	public StringCount[] GetCounts() 
	{
		StringCount[] counts = new StringCount[size];
		int index = 0;
		for (StringCount sc : table) {
		    if (sc != null) {
		        counts[index++] = sc;
		    }
		}
		java.util.Arrays.sort(counts, (a, b) -> a.str.compareTo(b.str));
		return counts;
	}

	/*
	 * Internal method to find a prime number at least as large as n.
	 * @param n the starting number (must be positive).
	 * @return a prime number larger than or equal to n.
	 */
	private static int nextPrime(int n)
	{
		if( n % 2 == 0 )
			n++;

		for( ; !isPrime(n); n += 2 );

		return n;
	}

	/*
	 * Internal method to test if a number is prime.
	 * Not an efficient algorithm.
	 * @param n the number to test.
	 * @return the result of the test.
	 */
	private static boolean isPrime(int n)
	{
		if( n == 2 || n == 3 )
			return true;

		if( n == 1 || n % 2 == 0 )
			return false;

		for( int i = 3; i * i <= n; i += 2 )
			if( n % i == 0 )
				return false;

		return true;
	}

	// insertionSort inserts the string count s into the proper place in the array
	public void insertionSort(StringCount s, StringCount[] array, int entries)
	{
		int insert = 0;
		
		for (int i = 0; i < entries; i++, insert++)
		{
			if(s.str.compareTo(array[i].str) <= 0)
				break;
		}
		
		if(insert == entries)
			array[insert] = s;
		else
		{
			for(int i = entries; i > insert; i--)
				array[i] = array[i-1];
			
			array[insert] = s;
		}
	}

	// main for unit testing
	public static void main(String[] args)
	{
		System.out.println("Hash Table Testing");
		
		MyHashTable table = new MyHashTable();
		
		// Example usage of nextPrime method
		int prime = nextPrime(53);
		System.out.println("Next prime number after 50 is: " + prime);
		
		table.IncCount("hello");
		table.IncCount("hello");
		
		table.IncCount("world");
		table.IncCount("world");
		table.IncCount("world");
		table.IncCount("world");
		
		table.IncCount("Happy Thanksgiving!");
		table.IncCount("Happy Thanksgiving!");
		table.IncCount("Happy Thanksgiving!");
		
		table.IncCount("Food");
		table.IncCount("Food");
		table.IncCount("Food");
		table.IncCount("Food");
		table.IncCount("Food");
		table.IncCount("Food");
		table.IncCount("Food");
		
		table.IncCount("cool");
		
		table.IncCount("Assignment due");
		table.IncCount("Assignment due");
		
		table.IncCount("Wednesday");
		
		table.IncCount("night");
		table.IncCount("night");
		
		table.IncCount("at");
		
		table.IncCount("TWELVE!!!");
		table.IncCount("TWELVE!!!");
		table.IncCount("TWELVE!!!");
		table.IncCount("TWELVE!!!");
		table.IncCount("TWELVE!!!");
		
		StringCount[] counts = table.GetCounts();
		String output = "";
		
		for(int i = 0; i < counts.length; i++)
		{
			if(counts[i] != null)
			{
				System.out.print("[" + counts[i].str +"," + counts[i].cnt + "], ");
				output += "[" + counts[i].str +"," + counts[i].cnt + "], ";
			}
			else
				System.out.print("NULL!!!!! " + i);
		}
		
		System.out.println();
		
		if(output.compareTo("[Assignment due,2], [Food,7], [Happy Thanksgiving!,3], [TWELVE!!!,5], [Wednesday,1], [at,1], [cool,1], [hello,2], [night,2], [world,4], ") == 0)
			System.out.println("Success! Output is correct.");
		else
			System.out.println("Failure! The output wasn't correct. Output was: \"" + output +"\"");
	}
}