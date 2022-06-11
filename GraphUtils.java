package GraphProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class GraphUtils {

	public void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v) {
		adjacencyList.get(u).add(v);
		adjacencyList.get(v).add(u);
		
		// if u=1 ,v=4 
		//adjacencyList.get(u).add(v)  => adjacencyList.get(1).add(4) therefore in 1 we have (2,3,4)
		//adjacencyList.get(v).add(u)  => adjacencyList.get(4).add(1)
	}

	public void printGraph(ArrayList<ArrayList<Integer>> adjacencyList) {
		for(int i=0;i<adjacencyList.size();i++) {
			System.out.println("Adjacency list of vertex "+i);
			System.out.print(" head");
			
			for(int j=0;j< adjacencyList.get(i).size();j++) {
				System.out.print( "-->" +adjacencyList.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		
	}

	public void doBFS(LinkedList<Integer>[] adjacencyList, int s, int V) {
		
		boolean visited[] = new boolean [V];
		Queue<Integer> queue = new LinkedList<Integer>();
		
		visited[s] = true;
		queue.add(s);
		
		while(!queue.isEmpty()) {
			s=queue.poll();
			System.out.print(" "+s);
			Iterator<Integer> it = adjacencyList[s].listIterator();
			
			while(it.hasNext()) {
				int next = it.next();
				if(!visited[next]) {
					visited[next] = true;
					queue.add(next);
				}
			}
		}
	}

	public void addDirectedEdge(LinkedList<Integer>[] adjacencyList, int u, int v) {
		adjacencyList[u].add(v);
	}


	public void doDFS(LinkedList<Integer>[] adjacencyList, int s, int V) {
		boolean visited[] = new boolean[V];
		doDFSUtil(adjacencyList,s,visited);
		
	}

	private void doDFSUtil(LinkedList<Integer>[] adjacencyList, int s, boolean[] visited) {
		visited[s] = true;
		System.out.print(s+" ");
		
		Iterator<Integer> it = adjacencyList[s].iterator();
		while(it.hasNext()) {
			int next = it.next();
			
			if(!visited[next]) {
				doDFSUtil(adjacencyList, next, visited);
			}
		}
	}

	public int findMotherVertex(LinkedList<Integer>[] adjacencyList, int V) {
		boolean visited[] = new boolean[V];
		
		int motherVertex = -1;
		
		//first do DFS
		for(int i=0;i<V;i++) {
			if(!visited[i]) {
				doDFSUtil(adjacencyList, i, visited);
				motherVertex = i;
			//	System.out.println("motherVertex loop is ::"+motherVertex);
		}
		}
		
		//then check if the mother vertex is the correct one
		boolean check[] = new boolean[V];
		doDFSUtil(adjacencyList, motherVertex, check);
		
		for(boolean val:check) {
			
			if(!val)
				return -1;
		}
		return motherVertex; 
		
		
		
	}

	public void doDFSUsingStack(LinkedList<Integer>[] adjacencyList, int s, int V) {
		
		boolean visited[] = new boolean[V];
		
		  for (int i = 0; i < V; i++)
              visited[i] =(false);
		  
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(s);
		
		while(!stack.isEmpty()) {
			s=stack.peek();
			stack.pop();
			
			  if(visited[s] == false)
              {
                  System.out.print(s + " ");
                  visited[s] = true;
              }
			Iterator<Integer> it = adjacencyList[s].listIterator();
			
			while(it.hasNext()) {
				int next = it.next();
				if(!visited[next]) {
					stack.push(next);
				}
			}
		}
	
		
	}

	public int countNoOfPaths(LinkedList<Integer>[] adjacencyList, int source, int destination) {
		int pathCount = 0;
		pathCount = pathCountUtil(adjacencyList,source,destination,pathCount);
		return pathCount;
	}

	private int pathCountUtil(LinkedList<Integer>[] adjacencyList, int source, int destination,int pathCount) {
		System.out.println("source:: "+source+" ::dest:: "+destination);
		if(source == destination)
			pathCount++;
		
		else {
			Iterator<Integer> it = adjacencyList[source].listIterator();
			while(it.hasNext()) {
				int next = it.next();
				System.out.println("source:: "+source+" ::dest:: "+next);
				pathCount =pathCountUtil(adjacencyList, next, destination, pathCount);
			}
		}
		return pathCount;
	}
	
}
