package MSInterview;

import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueues {

	public static void main(String[] args) {
		Stack stack = new Stack ();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.top());
		stack.pop();
		
		System.out.println(stack.top());
	}

}

class Stack{
	static Queue<Integer> q1= new LinkedList<Integer>();
	static Queue<Integer> q2= new LinkedList<Integer>();
	static int curr_size;
	
	Stack(){
		curr_size = 0;
	}
	public void push(int i) {
		curr_size++;
		
		q2.add(i);
		
		while(!q1.isEmpty()) {
			
			q2.add(q1.peek());
			q1.remove();
			
		}
		Queue<Integer> q = q1;
		q1=q2;
		q2= q;
		
	}

	public void pop() {
		if(q1.isEmpty())
			return;
		q1.remove();
		curr_size--;
	}

	public int top() {
		if(q1.isEmpty())
			return -1;
		return q1.peek();
	}
	
}
