public class ShortestPath
{
   public static void main (String args[])
   {
      final int INFINITY = 1000;
   
      for (i = 0; i < numberOfUndirectedEdges; i++)
      {
         boolean exists = false; 
         
         for (j = 0; j < numberOfVertices; j++)
         {
            if (from[i].equals(vertex[j]))
               exists = true;
         }
         
         if (!exists)
            vertex[numberofVertices++] = from[i];
      }
      
      //Dijkstra Algorithm Lines 3-4 
      for (i = 0; i < numberOfVertices; i++)
      {
         value[i] = INFINITY;
         path[i] = "(";
         
         //Dijkstra's Algorithm Lines 5-7
         circled[i] = false;
      }
      
      value [IndexOf(vertex, start)] = 0;
   }
}