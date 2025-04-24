/*
 * This class implements the graph representation by implementing the graph interface.
 */
import java.util.*;
import java.util.List;

/*
 * A representation of a graph.
 * Assumes that we do not have negative cost edges in the graph.
 */
public class MyGraph implements Graph {
    private Set<Vertex> vertices; // Saves the vertices passed in
    private Set<Edge> edges; // Saves the edges passed in
    private Map<Vertex, Integer> vertexIndex; // Assigns each vertex with an index, able to locate
    private Map<VertexTuple, Edge> edgesMap; // Stores edges, able to find edge by key VertexTuple
    private ArrayList<LinkedList<Vertex>> adjacencyList; // Stores the graph

    /*
     * Creates a MyGraph object with the given collection of vertices
     * and the given collection of edges.
     * @param vs a collection of the vertices in this graph
     * @param es a collection of the edges in this graph
     * @throws IllegalArgumentException if edges involve invalid vertices,
     *                                  or if edge weights are negative,
     *                                  or if duplicate edges with different weights are found.
     */
    public MyGraph(Collection<Vertex> vs, Collection<Edge> es) {
        vertices = new HashSet<>();
        edges = new HashSet<>();
        vertexIndex = new HashMap<>();
        edgesMap = new HashMap<>();
        adjacencyList = new ArrayList<>();

        int i = 0;

        // Add vertices to the graph
        for (Vertex v : vs) {
            if (!vertices.contains(v)) {
                vertices.add(v);
                vertexIndex.put(v, i++);
                adjacencyList.add(new LinkedList<>());
            }
        }

        // Add edges to the graph
        for (Edge e : es) {
            Vertex from = e.getSource();
            Vertex to = e.getDestination();

            // Check if the vertices of the edge exist in the graph
            if (!vertices.contains(from) || !vertices.contains(to)) {
                throw new IllegalArgumentException("Edge involves vertices not in the graph.");
            }

            // Check if the edge weight is non-negative
            if (e.getWeight() < 0) {
                throw new IllegalArgumentException("Edge weight cannot be negative.");
            }

            // Check for duplicate edges with different weights
            VertexTuple vt = new VertexTuple(from, to);
            if (edgesMap.containsKey(vt)) {
                if (edgesMap.get(vt).getWeight() != e.getWeight()) {
                    throw new IllegalArgumentException("Duplicate edges with different weights found.");
                }
                // Ignore redundant edge information
                continue;
            }

            // Add the edge to the graph
            edges.add(e);
            edgesMap.put(vt, e);
            adjacencyList.get(vertexIndex.get(from)).add(to);
        }
    }

    /* 
     * Return the collection of vertices of this graph
     * @return the vertices as a collection (which is anything iterable)
     */
    public Collection<Vertex> vertices() {
        return new HashSet<>(vertices); // Return a copy of the vertices set
    }

    /* 
     * Return the collection of edges of this graph
     * @return the edges as a collection (which is anything iterable)
     */
    public Collection<Edge> edges() {
        return new HashSet<>(edges); // Return a copy of the edges set
    }

    /*
     * Return a collection of vertices adjacent to a given vertex v.
     *   i.e., the set of all vertices w where edges v -> w exist in the graph.
     * Return an empty collection if there are no adjacent vertices.
     * @param v one of the vertices in the graph
     * @return an iterable collection of vertices adjacent to v in the graph
     * @throws IllegalArgumentException if v does not exist.
     */
    public Collection<Vertex> adjacentVertices(Vertex v) {
        checkVertexExists(v);
        return new HashSet<>(adjacencyList.get(vertexIndex.get(v))); // Return adjacent vertices
    }

    /*
     * Test whether vertex b is adjacent to vertex a (i.e. a -> b) in a directed graph.
     * Assumes that we do not have negative cost edges in the graph.
     * @param a one vertex
     * @param b another vertex
     * @return cost of edge if there is a directed edge from a to b in the graph, 
     * return -1 otherwise.
     * @throws IllegalArgumentException if a or b do not exist.
     */
    @Override
    public int edgeCost(Vertex a, Vertex b) {
        checkVertexExists(a);
        checkVertexExists(b);

        VertexTuple vt = new VertexTuple(a, b);
        if (edgesMap.containsKey(vt)) {
            return edgesMap.get(vt).getWeight(); // Return the weight of the edge
        }

        return -1; // Return -1 if no edge exists
    }

    /*
     * Returns the shortest path from a to b in the graph, or null if there is
     * no such path. Assumes all edge weights are nonnegative.
     * Uses Dijkstra's algorithm.
     * @param a the starting vertex
     * @param b the destination vertex
     * @return a Path where the vertices indicate the path from a to b in order
     *   and contains a (first) and b (last) and the cost is the cost of 
     *   the path. Returns null if b is not reachable from a.
     * @throws IllegalArgumentException if a or b do not exist.
     */
    public Path shortestPath(Vertex a, Vertex b) {
        checkVertexExists(a);
        checkVertexExists(b);

        // Dijkstra's algorithm
        PriorityQueue<AugmentedVertex> pq = new PriorityQueue<>();
        Map<Vertex, AugmentedVertex> augmentedVertices = new HashMap<>();
        Map<Vertex, Vertex> previous = new HashMap<>();

        for (Vertex v : vertices) {
            AugmentedVertex av = new AugmentedVertex(v, Integer.MAX_VALUE);
            augmentedVertices.put(v, av);
            if (v.equals(a)) {
                av.cost = 0;
            }
            pq.add(av);
        }

        while (!pq.isEmpty()) {
            AugmentedVertex current = pq.poll();
            if (current.v.equals(b)) {
                break; // Stop when we reach the destination
            }

            for (Vertex neighbor : adjacentVertices(current.v)) {
                int edgeCost = edgeCost(current.v, neighbor);
                AugmentedVertex neighborAV = augmentedVertices.get(neighbor);

                if (current.cost + edgeCost < neighborAV.cost) {
                    pq.remove(neighborAV); // Update priority
                    neighborAV.cost = current.cost + edgeCost;
                    previous.put(neighbor, current.v);
                    pq.add(neighborAV);
                }
            }
        }

        // Reconstruct the path
        if (!previous.containsKey(b)) {
            return null; // No path exists
        }

        List<Vertex> path = new LinkedList<>();
        Vertex current = b;
        int totalCost = augmentedVertices.get(b).cost;

        while (current != null) {
            path.add(0, current);
            current = previous.get(current);
        }

        return new Path(path, totalCost);
    }

    // Helper method to check if a vertex exists in the graph
    private void checkVertexExists(Vertex v) {
        if (!vertices.contains(v)) {
            throw new IllegalArgumentException("Vertex does not exist in the graph.");
        }
    }

    // Inner class for augmented vertices used in Dijkstra's algorithm
    private class AugmentedVertex implements Comparable<AugmentedVertex> {
        private final Vertex v;
        private int cost;

        public AugmentedVertex(Vertex v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(AugmentedVertex other) {
            return Integer.compare(this.cost, other.cost);
        }
    }

    // Inner class for vertex tuples used as keys in the edges map
    private class VertexTuple {
        private final Vertex from;
        private final Vertex to;

        public VertexTuple(Vertex from, Vertex to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            VertexTuple other = (VertexTuple) obj;
            return Objects.equals(from, other.from) && Objects.equals(to, other.to);
        }
    }
}


