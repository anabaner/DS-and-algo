package GraphProblems;

import java.util.LinkedList;

public class GraphBFSTraversal {

	public static void main(String[] args) {
		int V = 7;
		LinkedList<Integer> adjacencyList[] = new LinkedList[V];
		
		for(int i =0;i<V;++i) {
			adjacencyList[i] = new LinkedList<Integer>();
		}  //will contain 5 integer lists in a list 
		//System.out.println(adjacencyList); //o/p - [[], [], [], [], []]
		
		GraphUtils g = new GraphUtils();
		
		/*
		 * g.addDirectedEdge(adjacencyList,0,1); g.addDirectedEdge(adjacencyList,0,2);
		 * g.addDirectedEdge(adjacencyList,1,2); g.addDirectedEdge(adjacencyList,2,0);
		 * g.addDirectedEdge(adjacencyList,2,3); g.addDirectedEdge(adjacencyList,3,3);
		 */ //o/p - 2,0,3,1
		
		
		g.addDirectedEdge(adjacencyList,1,2);
		g.addDirectedEdge(adjacencyList,1,3);
		g.addDirectedEdge(adjacencyList,2,4);
		g.addDirectedEdge(adjacencyList,2,5);
		g.addDirectedEdge(adjacencyList,3,5);
		g.addDirectedEdge(adjacencyList,4,5);
		g.addDirectedEdge(adjacencyList,4,6);
		g.addDirectedEdge(adjacencyList,5,6);

		
		for(int i=0;i<adjacencyList.length;i++)
		System.out.println(adjacencyList[i]);
		System.out.println("BFS of the list starting from vertex 1:: ");
		g.doBFS(adjacencyList,1,V);
	}

}

//Takeaway - if starting from 1 , make V= V+1
//e.g V=7 for 6 vertices if starts from 1 , so for ex 1 -V= 4 , for ex 2- V=7
