package GraphProblems;

import java.util.ArrayList;

// (u,v) - represents there is an edge from vertex u to vertex v
//V - no of vertices


public class CreateGraph {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();
		
		int V = 5;
		for(int i =0;i<V;i++) {
			adjacencyList.add(new ArrayList<Integer>());
		}  //will contain 5 integer lists in a list 
		System.out.println(adjacencyList); //o/p - [[], [], [], [], []]
		
		GraphUtils g = new GraphUtils();
		
		g.addEdge(adjacencyList,0,1);
		g.addEdge(adjacencyList,0,4);
		g.addEdge(adjacencyList,1,2);
		g.addEdge(adjacencyList,1,3);
		g.addEdge(adjacencyList,1,4);
		g.addEdge(adjacencyList,2,3);
		g.addEdge(adjacencyList,3,4);
		
		g.printGraph(adjacencyList);
		
		System.out.println(adjacencyList); //[[1, 4], [0, 2, 3, 4], [1, 3], [1, 2, 4], [0, 1, 3]]
		
		
	}

}
