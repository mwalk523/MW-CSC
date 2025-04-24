public class UpTreeArray {
    private int[] parent;
    private int[] rank;

    // Constructor to initialize the up-tree structure
    public UpTreeArray(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    // Find the root of the set containing x with path compression
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    // Union two sets by rank
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
        }
    }

    // Check if two elements are in the same set
    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}
