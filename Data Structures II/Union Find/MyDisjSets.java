public class MyDisjSets implements DisjointSets
{
    private int numSets; // Number of disjoint sets
    int numElements; // Total number of elements
    int[] parent; // Parent array to store the parent of each element
    int[] rank; // Rank array to store the rank of each element

    // Constructor
    public MyDisjSets(int elements)
    {
        numElements = elements;
        parent = new int[elements];
        rank = new int[elements];
        numSets = elements;
        for (int i = 0; i < elements; i++) 
        {
            parent[i] = i; // Each element is its own parent (root of itself)
            rank[i] = 0; // Initial rank is 0
        }
    }

    @Override
    public void union(int set1, int set2) 
    {
        if (!isSetName(set1) || !isSetName(set2)) {
            throw new IllegalArgumentException("Invalid set name");
        }
        
        int root1 = find(set1); // Find the root of set1
        int root2 = find(set2); // Find the root of set2

        if (root1 != root2) {
            // Union by rank
            if (rank[root1] > rank[root2]) {
                parent[root2] = root1; // Make root1 the parent of root2
            } else if (rank[root1] < rank[root2]) {
                parent[root1] = root2; // Make root2 the parent of root1
            } else {
                parent[root2] = root1; // Make root1 the parent of root2
                rank[root1]++; // Increment the rank of root1
            }
            numSets--; // Decrease the number of sets
        }
    }

    @Override
    public int find(int x) 
    {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression: make the parent of x the root
        }
        return parent[x]; // Return the root of x
    }

    @Override
    public int numSets() 
    {
        return numSets; // Return the current number of sets
    }

    @Override
    public boolean isSetName(int x) 
    {
        return x >= 0 && x < numElements && parent[x] == x; // Check if x is a root
    }

    @Override
    public int numElements(int setNum) 
    {
        if (!isSetName(setNum)) {
            throw new IllegalArgumentException("Invalid set name");
        }
        int count = 0;
        for (int i = 0; i < numElements; i++) {
            if (find(i) == setNum) {
                count++; // Count the number of elements in the set
            }
        }
        return count;
    }

    @Override
    public void printElements(int setNum) 
    {
        if (!isSetName(setNum)) {
            throw new IllegalArgumentException("Invalid set name(s)");
        }
        for (int i = 0; i < numElements; i++) {
            if (find(i) == setNum) {
                System.out.print(i + ", "); // Print the elements in the set
            }
        }
        System.out.println();
    }

    @Override
    public int[] getElements(int setNum) 
    {
        if (!isSetName(setNum)) {
            throw new IllegalArgumentException("Invalid set name");
        }
        int[] elements = new int[numElements(setNum)];
        int index = 0;
        for (int i = 0; i < numElements; i++) {
            if (find(i) == setNum) {
                elements[index++] = i; // Collect the elements in the set
            }
        }
        return elements;
    }

    public interface DisjointSets 
    {
        public void union(int set1, int set2);
        public int find(int x);
        public int numSets();
        public boolean isSetName(int x);
        public int numElements(int setNum);
        public void printElements(int setNum);
        public int [] getElements(int setNum);
    }    
}
