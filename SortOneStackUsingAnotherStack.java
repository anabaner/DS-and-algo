package ArrayProblems;

import java.util.Stack;

public class SortOneStackUsingAnotherStack {

	public static void main(String[] args) {
		Stack<Integer> input  = new Stack<Integer>();
		input.add(5);
		input.add(8);
		input.add(10);
		input.add(2);
		
		Stack<Integer> temp = sortStack(input);
		System.out.println(temp);
		
	}

	private static Stack<Integer> sortStack(Stack<Integer> input) {
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!input.isEmpty()) {

			int temp = input.pop();

			while(!tempStack.isEmpty() && tempStack.peek() >temp) {
				
				input.push(tempStack.pop());
			}
			
			tempStack.push(temp);
		}
		return tempStack;
	}

}
