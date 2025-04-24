/*
 * This class is a Hash Table using Java HashMap that implements the StringCounter interface.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;

public class JavaHashTable implements StringCounter {

    private Map<String, Integer> map;

    public JavaHashTable() {
        map = new HashMap<>();
    }

    // IncCount increments the count for a particular string
    public void IncCount(String s) {
        map.put(s, map.getOrDefault(s, 0) + 1);
    }

    // GetSize returns the number of unique strings
    public int GetSize() {
        return map.size();
    }

    // GetCounts returns an array of all the string-count pairs
    // in the dictionary, sorted lexicographically by strings.
    public StringCount[] GetCounts() {
        StringCount[] counts = new StringCount[map.size()];
        int index = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            counts[index++] = new StringCount(entry.getKey(), entry.getValue());
        }

        // Sort the array lexicographically by string
        Arrays.sort(counts, (a, b) -> a.str.compareTo(b.str));
        return counts;
    }

    // insertionSort inserts the string count s into the proper place in the array
    public void insertionSort(StringCount s, StringCount[] array, int entries) {
        int insert = 0;

        for (int i = 0; i < entries; i++, insert++) {
            if (s.str.compareTo(array[i].str) <= 0)
                break;
        }

        if (insert == entries) {
            array[insert] = s;
        } else {
            for (int i = entries; i > insert; i--) {
                array[i] = array[i - 1];
            }
            array[insert] = s;
        }
    }

    // main for unit testing
    public static void main(String[] args) {
        System.out.println("Hash Table Testing");

        JavaHashTable table = new JavaHashTable();

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

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != null) {
                System.out.print("[" + counts[i].str + "," + counts[i].cnt + "], ");
                output += "[" + counts[i].str + "," + counts[i].cnt + "], ";
            } else
                System.out.print("NULL!!!!! " + i);
        }

        System.out.println();

        if (output.compareTo("[Assignment due,2], [Food,7], [Happy Thanksgiving!,3], [TWELVE!!!,5], [Wednesday,1], [at,1], [cool,1], [hello,2], [night,2], [world,4], ") == 0)
            System.out.println("Success! Output is correct.");
        else
            System.out.println("Failure! The output wasn't correct. Output was: \"" + output + "\"");
    }
}

