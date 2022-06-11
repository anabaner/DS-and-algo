package GraphProblems;

import java.util.LinkedList;
/*
 * Complexity Analysis: 

Time complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
Space Complexity: O(V), since an extra visited array of size V is required.
 */
public class GraphDFSTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int V = 4;
		LinkedList<Integer> adjacencyList[] = new LinkedList[V];
		
		for(int i =0;i<V;++i) {
			adjacencyList[i] = new LinkedList<Integer>();
		}  //will contain 5 integer lists in a list 
		//System.out.println(adjacencyList); //o/p - [[], [], [], [], []]
		
		GraphUtils g = new GraphUtils();
		
		
		  g.addDirectedEdge(adjacencyList,0,1);
		  g.addDirectedEdge(adjacencyList,0,2);
		  g.addDirectedEdge(adjacencyList,1,2);
		  g.addDirectedEdge(adjacencyList,2,0);
		  g.addDirectedEdge(adjacencyList,2,3);
		  g.addDirectedEdge(adjacencyList,3,3);
		 
			for(int i=0;i<adjacencyList.length;i++)
				System.out.println(adjacencyList[i]);
				System.out.println("DFS of the list starting from vertex 1:: ");
				g.doDFS(adjacencyList,2,V);
		
	}

}
