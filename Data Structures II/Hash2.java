import java.util.ArrayList;

public class Hash2 
{
    private final int bucket;
    private final ArrayList<Integer>[] table;

    public Hash2(int bucket)
    {
        this.bucket = bucket;
        this.table = new ArrayList[bucket];
        for (int i = 0; i < bucket; i++)
        {
            table[i] = new ArrayList<>();
        }
    }

    public int hashFunction (int key)
    {
        return (key % bucket);
    }

    public void insertItem(int key)
    {
        int index = hashFunction(key);
        table[index].add(key);
    }

    public void deleteItem(int key)
    {
        int index = hashFunction(key);
        if(!table[index].contains(key))
            return;

        table[index].remove(Integer.valueOf(key));
    }

    public void displayHash()
    {
        for (int i = 0; i < bucket; i++)
        {
            System.out.print(i);

            for (int x : table[i])
            {
                System.out.print("-->" +x);
            }
            System.out.print("\n");
        }
    }
}
