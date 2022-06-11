package GraphProblems;

import java.util.LinkedList;

public class GraphMotherVertexPrint {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int V = 7;
		LinkedList<Integer> adjacencyList[] = new LinkedList[V];
		
		for(int i =0;i<V;++i) {
			adjacencyList[i] = new LinkedList<Integer>();
		}  
		
		GraphUtils g = new GraphUtils();
		
		
		  g.addDirectedEdge(adjacencyList,0,1);
		  g.addDirectedEdge(adjacencyList,0,2);
		  g.addDirectedEdge(adjacencyList,1,3);
		  g.addDirectedEdge(adjacencyList,4,1);
		  g.addDirectedEdge(adjacencyList,6,4);
		  g.addDirectedEdge(adjacencyList,5,6);
		  g.addDirectedEdge(adjacencyList,5,2);
		  g.addDirectedEdge(adjacencyList,6,0);
		 
			for(int i=0;i<adjacencyList.length;i++)
				System.out.println(adjacencyList[i]);
				
				int motherVertex = g.findMotherVertex(adjacencyList,V);
				System.out.println("Mother vertex of the list starting from vertex 0 is:: "+motherVertex);
	
	}

}
