/*
 * This class implements the graph representation by implementing the graph interface.
 */
import java.util.*;

/*
 * A representation of a graph.
 * Assumes that we do not have negative cost edges in the graph.
 */
public class MyGraph implements Graph, VertexMap
{
	private int size; //saves the number of vertices
	private Set<Vertex> vertices;  // saves the vertices passed in
	private Set<Edge> edges;  // saves the edges passed in
	private Map<Vertex, Integer> vertexIndex; //assign each vertex with index, able to locate
	private Map<VertexTuple, Edge> edgesMap; //stores edges, able to find edge by key vertexTuple
	private ArrayList<LinkedList<Vertex>> adjacencyList;  //stores the graph

	/*
	 * Creates a MyGraph object with the given collection of vertices
	 * and the given collection of edges.
	 * @param v a collection of the vertices in this graph
	 * @param e a collection of the edges in this graph
	 */
	public MyGraph(Collection<Vertex> vs, Collection<Edge> es) 
   {
		// set up, assign all global variables
		// i.e HashSet to avoid duplicates
		size = vs.size();
		vertices = new HashSet<Vertex>();
		edges = new HashSet<Edge>();
		vertexIndex = new HashMap<Vertex, Integer>();
		edgesMap = new HashMap<VertexTuple, Edge>();
		adjacencyList = new ArrayList<LinkedList<Vertex>>();
		int i = 0;
		
		// adds each vertex in vs into vertices and updates the corresponding data
		for (Vertex v : vs) 
      {
			vertices.add(v);
			vertexIndex.put(v, i);
			adjacencyList.add(new LinkedList<Vertex>());
			i++;
		}

		// adds each edge in es into edgeMap and updates the corresponding data
		for (Edge e : es) 
      {
			Vertex from = e.getSource();
			Vertex to = e.getDestination();
			VertexTuple vt = new VertexTuple(from, to);
			//if(edgesMap.containsKey(vt) && edgesMap.get(vt).getWeight()!=e.getWeight())
				//throw new IllegalArgumentException("duplicate edges with different weight!");
			int fromIndex = vertexIndex.get(from);
			adjacencyList.get(fromIndex).add(to); //goes to the vertex from bucket, add to
			edgesMap.put(new VertexTuple(from, to), e);
			edges.add(e);
		}
	}

	/* 
	 * Return the collection of vertices of this graph
	 * @return the vertices as a collection (which is anything iterable)
	 */
	public Collection<Vertex> vertices() 
   {
		Set<Vertex> result = new HashSet<Vertex>();
		for(Vertex v: vertices)
			result.add(v);
		return result;
	}


	/* 
	 * Return the collection of edges of this graph
	 * @return the edges as a collection (which is anything iterable)
	 */
	public Collection<Edge> edges() 
   {
		Set<Edge> result = new HashSet<Edge>();
		for(Edge e: edges) //copies out
			result.add(e);
		return result;
	}

	/*
	 * Return a collection of vertices adjacent to a given vertex v.
	 *   i.e., the set of all vertices w where edges v -> w exist in the graph.
	 * Return an empty collection if there are no adjacent vertices.
	 * @param v one of the vertices in the graph
	 * @return an iterable collection of vertices adjacent to v in the graph
	 * @throws IllegalArgumentException if v does not exist.
	 */
	public Collection<Vertex> adjacentVertices(Vertex v) 
   {
		checkExceptions(v);
		Set<Vertex> s = new HashSet<Vertex>(); //copies out
		for(Vertex temp: adjacencyList.get(vertexIndex.get(v)))
			s.add(temp);
		return s;
	}

   /*
    * Breadth-First Search
    */
   public void BreadthFirstSearch(Vertex start)
   {
      // Ensure the starting vertex exists in the graph
      checkExceptions(start);

      // Set to keep track of discovered vertices
      HashSet<Vertex> discovered = new HashSet<Vertex>();
      // Queue to manage the BFS traversal
      Queue<Vertex> queue = new ArrayDeque<Vertex>();

      // Add the starting vertex to the queue and mark it as discovered
      queue.add(start);
      discovered.add(start);

      // Process the queue until it's empty
      while (!queue.isEmpty()) {
         // Remove the front vertex from the queue
         Vertex current = queue.poll();
         System.out.println("Visited: " + current); // Example action: print the vertex

         // Get all adjacent vertices of the current vertex
         for (Vertex neighbor : adjacentVertices(current)) 
		 {
            if (!discovered.contains(neighbor)) //If the neighbor hasn't been discovered yet
			{
               // Mark it as discovered and add it to the queue
               discovered.add(neighbor);
               queue.add(neighbor);
            }
         }
      }
   }

   /*
    * Depth-First Search
    */
   public void DepthFirstSearch(Vertex start)
   {
      // Ensure the starting vertex exists in the graph
      checkExceptions(start);

      // Set to keep track of discovered vertices
      HashSet<Vertex> discovered = new HashSet<Vertex>();
      // Stack to manage the DFS traversal
      Stack<Vertex> stack = new Stack<Vertex>();

      // Add the starting vertex to the stack and mark it as discovered
      stack.push(start);
      discovered.add(start);

      // Process the stack until it's empty
      while (!stack.isEmpty()) {
         // Remove the top vertex from the stack
         Vertex current = stack.pop();
         System.out.println("Visited: " + current); // Example action: print the vertex

         // Get all adjacent vertices of the current vertex
         for (Vertex neighbor : adjacentVertices(current)) {
            // If the neighbor hasn't been discovered yet
            if (!discovered.contains(neighbor)) {
               // Mark it as discovered and add it to the stack
               discovered.add(neighbor);
               stack.push(neighbor);
            }
         }
      }
   }

	// helper method, checks if parameter vertex a and b are vertices exist in the graph
	private void checkExceptions(Vertex a)
   {
		if((!vertices.contains(a)))
			throw new IllegalArgumentException("vertex passed in does not exist!");
	}

	// Implementation of vertexTuple so we can construct vertexTuple, get hash code, and compare
	private class VertexTuple 
   {
		private final Vertex from; //stores the starting vertex 
		private final Vertex to; //stores the destination vertex
		
		//constructor
		public VertexTuple(Vertex from, Vertex to) 
      {
			this.from = from;
			this.to = to;
		}
		
		//auto-generated: hashes on from and to
		public int hashCode() 
      {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((from == null) ? 0 : from.hashCode());
			result = prime * result + ((to == null) ? 0 : to.hashCode());
			return result;
		}
 		
		// makes it comparable by comparing from and to vertices
		public boolean equals(Object obj) 
      {
			if (this == obj) //if equal
				return true;
			if (obj == null) //if obj passed in null 
				return false;
			if (getClass() != obj.getClass()) //compares the runtime class of the object
				return false;
			final VertexTuple other = (VertexTuple) obj;
			
			if (from == null) 
         {
				if (other.from != null)
					return false;  //from: a.null b.not null
			} 
         else if (!from.equals(other.from)) 
         { 
				return false; //from are different
			}
			if (to == null) //two from are same here
				return other.to == null; //if both to null
			else 
				return to.equals(other.to); //if two to are the same
		}
   }   

   @Override
   public String getVertexInfo(Vertex v) {
       // Ensure the vertex exists in the graph
       checkExceptions(v);

       // Retrieve the index of the vertex
       int index = vertexIndex.get(v);

       // Retrieve the adjacent vertices
       Collection<Vertex> adjacent = adjacentVertices(v);

       // Build and return the information string
       StringBuilder info = new StringBuilder();
       info.append("Vertex: ").append(v).append("\n");
       info.append("Index: ").append(index).append("\n");
       info.append("Adjacent Vertices: ").append(adjacent).append("\n");

       return info.toString();
   }
}
