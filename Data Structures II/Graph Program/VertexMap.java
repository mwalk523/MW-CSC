public interface VertexMap {
    /**
     * Retrieves information about a given vertex.
     * @param v the vertex to look up
     * @return a string containing information about the vertex
     * @throws IllegalArgumentException if the vertex does not exist in the graph
     */
    String getVertexInfo(Vertex v);
}