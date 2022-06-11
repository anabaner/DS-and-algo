
/*Time Complexity: O(2^(n^2)). 
The recursion can run upper-bound 2^(n^2) times.
Space Complexity: O(n^2). 
Output matrix is required so an extra space of size n*n is needed.
 */
public class RatinAMazeBacktracking {
static int n;
	public static void main(String[] args) {

		
		int maze[][] = {{ 1, 0, 0, 0 },
						{ 1, 1, 0, 1 },
						{ 0, 1, 0, 0 },
						{ 1, 1, 1, 1 } };
		n = maze.length;
		System.out.println(n);
		solveMaze(maze);
		
		
	}

	private static boolean solveMaze(int[][] maze) {
		
		int sol[][] = new int [n][n];
		
		if(solveMazeUtil(maze,0,0, sol) == false) {
			System.out.println("Soln doesnt exist");
				return false;
		}
		printSolution(sol);
		return true;
		
	}

	
	private static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
		if(x==n-1 && y==n-1 && maze[x][y] ==1) { //reached the end 
				sol[x][y] =1;
				return true;
		}
		
		if(isSafe(maze,x,y)) {
			
			if(sol[x][y]==1)
				return false;
			
			sol[x][y] =1;
			
			if(solveMazeUtil(maze, x+1, y, sol))
				return true;
			
			if(solveMazeUtil(maze, x, y+1, sol))
				return true;
			
			if(solveMazeUtil(maze, x-1, y, sol))
				return true;
			
			if(solveMazeUtil(maze, x, y-1, sol))
				return true;
			
			sol[x][y] =0; // if none of the above method work backtrack and mark 0
			return false;
			
		}
		
		return false;
	}
	
	private static boolean isSafe(int[][] maze, int x, int y) {
		
		return (x>=0 && x<n && y>=0 && y<n && maze[x][y]==1);
	}

	private static void printSolution(int[][] sol) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" "+sol[i][j]);
			}
			System.out.println(" ");;
		}
	}


}
