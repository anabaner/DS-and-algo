package GraphProblems;

import java.util.LinkedList;

public class DFSUsingStack {

	public static void main(String[] args) {

		int V = 5;
		LinkedList<Integer> adjacencyList[] = new LinkedList[V];
		
		for(int i =0;i<V;++i) {
			adjacencyList[i] = new LinkedList<Integer>();
		}		
		GraphUtils g = new GraphUtils();
		
		
		/*
		 * g.addDirectedEdge(adjacencyList,0,1); g.addDirectedEdge(adjacencyList,0,2);
		 * g.addDirectedEdge(adjacencyList,1,2); g.addDirectedEdge(adjacencyList,2,0);
		 * g.addDirectedEdge(adjacencyList,2,3); g.addDirectedEdge(adjacencyList,3,3);
		 * 
		 */
			
			 g.addDirectedEdge(adjacencyList,1,0);
			 g.addDirectedEdge(adjacencyList,0,2);
			 g.addDirectedEdge(adjacencyList,2,1);
			 g.addDirectedEdge(adjacencyList,0,3);
			 g.addDirectedEdge(adjacencyList,1,4);
			 
			for(int i=0;i<adjacencyList.length;i++)
				System.out.println(adjacencyList[i]);
				System.out.println("DFS of the list starting from vertex 0:: ");
				g.doDFSUsingStack(adjacencyList,0,V);
		
	}

}
