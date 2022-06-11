package GraphProblems;

import java.util.LinkedList;

public class GraphPathCount {

	public static void main(String[] args) {

		int V = 5;
		LinkedList<Integer> adjacencyList[] = new LinkedList[V];
		
		for(int i =0;i<V;++i) 
			adjacencyList[i] = new LinkedList<Integer>();
		
		GraphUtils g = new GraphUtils();
		
		
		  g.addDirectedEdge(adjacencyList,0,1);
		  g.addDirectedEdge(adjacencyList,0,2);
		  g.addDirectedEdge(adjacencyList,0,3);
		  g.addDirectedEdge(adjacencyList,1,3);
		  g.addDirectedEdge(adjacencyList,2,3);
		  g.addDirectedEdge(adjacencyList,1,4);
		  g.addDirectedEdge(adjacencyList,2,4);
		 
			for(int i=0;i<adjacencyList.length;i++)
				System.out.println(adjacencyList[i]);
			
			int source =0,destination = 3;
				
				int countPaths = g.countNoOfPaths(adjacencyList,source,destination);
				System.out.println("No of paths going from 0 to 3 is:: "+countPaths);
				
				//try without recursion and print the paths
		
	}

}

