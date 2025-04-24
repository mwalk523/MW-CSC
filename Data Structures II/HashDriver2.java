public class HashDriver2 
{
    public static void main(String[] args)
    {
        // array that contains keys to be mapped
        int[] a = { 15, 11, 27, 8, 30, 13, 19, 5, 6, 9, 55, 16, 23, 3, 14, 27, 31, 19, 12, 17};

        // Create a empty has of BUCKET_SIZE
        Hash h = new Hash(20);

        // insert the keys into the hash table
        for (int x : a) 
        {
            h.insertItem(x);
        }

        // delete 12 from the hash table
        h.deleteItem(12);

        // Display the hash table
        h.displayHash();
    }
}
