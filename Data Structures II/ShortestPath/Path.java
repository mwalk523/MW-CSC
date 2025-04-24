import java.util.List;

public class Path {
    private final List<Vertex> vertices;
    private final int totalCost;

    public Path(List<Vertex> vertices, int totalCost) {
        this.vertices = vertices;
        this.totalCost = totalCost;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Path{" +
               "vertices=" + vertices +
               ", totalCost=" + totalCost +
               '}';
    }
}