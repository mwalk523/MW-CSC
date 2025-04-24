public class MyDisjSets2 implements DisjointSets
{
    private int[] parent;
    private int[] rank;
    private int numSets;
    int numElements;

    //constructor 
    public MyDisjSets2(int elements)
    {
        numElements = elements;
        parent = new int[elements];
        rank = new int[elements];
        numSets = elements;
        for (int i = 0; i < elements; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    @Override
    public void union(int set1, int set2) {
        int root1 = find(set1);
        int root2 = find(set2);

        if (root1 != root2) {
            if (rank[root1] > rank[root2]) {
                parent[root2] = root1;
            } else if (rank[root1] < rank[root2]) {
                parent[root1] = root2;
            } else {
                parent[root2] = root1;
                rank[root1]++;
            }
            numSets--;
        }
    }

    @Override
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    @Override
    public int numSets() {
        return numSets;
    }

    @Override
    public boolean isSetName(int x) {
        return x >= 0 && x < numElements && parent[x] == x;
    }

    @Override
    public int numElements(int setNum) {
        if (!isSetName(setNum)) {
            throw new IllegalArgumentException("Invalid set name");
        }
        int count = 0;
        for (int i = 0; i < numElements; i++) {
            if (find(i) == setNum) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void printElements(int setNum) {
        if (!isSetName(setNum)) {
            throw new IllegalArgumentException("Invalid set name");
        }
        for (int i = 0; i < numElements; i++) {
            if (find(i) == setNum) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    @Override
    public int[] getElements(int setNum) {
        if (!isSetName(setNum)) {
            throw new IllegalArgumentException("Invalid set name");
        }
        int[] elements = new int[numElements(setNum)];
        int index = 0;
        for (int i = 0; i < numElements; i++) {
            if (find(i) == setNum) {
                elements[index++] = i;
            }
        }
        return elements;
    }

    public interface DisjointSets 
    {

    /*
     * Union (combine) two disjoint sets into one set. 
     * No restriction on which set should be added to the other set.
     * @param set1 the name of set 1.
     * @param set2 the name of set 2.
     * @throws InvalidSetNameException if either of set1 or set2 are 
     * not the name of sets.
     */
    public void union(int set1, int set2);

    /*
     * Find which set element x belongs to.
     * @param x the element being searched for.
     * @return the name of the set containing x.
     * @throws InvalidElementException if x is not a valid element. 
     */
    public int find(int x);

    /*
     * Returns the current total number of sets.
     * @return the current number of sets.
     */
    public int numSets();

    /*
     * Determine if an element is the name of a set.
     * @param x an element
     * @return true if x is the name of a set
     * @throws InvalidElementException if x is not a valid element. 
     */
    public boolean isSetName(int x);

    /*
     * Returns the total number of elements in the given set.
     * @param setNum the name of a set
     * @throws InvalidSetNameException if setNum is not the name of a set.
     */
    public int numElements(int setNum);

    /*
     * Prints out the elements in the given set.
     * setNum is assumed to be a root and represents the name of a set.
     * @param setNum the name of a set
     * @throws InvalidSetNameException if setNum is not the name of a set.
     */
    public void printElements(int setNum);

    /*
     * Returns an array containing the elements in the given set.
     * @param setNum the name of a set
     * @returns an array containing the elements in the given set.
     * @throws InvalidSetNameException if setNum is not the name of a set.
     */
    public int [] getElements(int setNum);
    }    
    
}
