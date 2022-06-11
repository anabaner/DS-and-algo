package StackPrograms;
/*
 * Time Complexity: 
Push operation : O(1)
Pop operation : O(1)
Auxiliary Space :O(N). 
Use of array to implement stack so it is a space-optimized method. 
--idea - to start two stacks from two extreme corners of arr[]. stack1 starts from the leftmost element, 
the first element in stack1 is pushed at index 0. The stack2 starts from the rightmost corner, 
the first element in stack2 is pushed at index (n-1).
 Both stacks grow (or shrink) in opposite direction. 
 To check for overflow, all we need to check is for space between top elements of both stacks
 */
public class TwoStacks {
	int size;
	int arr[];
	int top1;
	int top2;
	
	TwoStacks(int n){
		arr= new int[n];
		size = n;
		top1= -1;
		top2 = size;
		
	}
	
	public static void main(String[] args) {
		TwoStacks ts = new TwoStacks(5);
		ts.push1(11);
		ts.push2(13);
		ts.pop1();
		ts.pop2();
	}

	private void pop2() {
		if(top2<size) {
			top2++;
		}
		else {
			System.out.println("Stack2 is underflow");
			return;
		}
	}

	private void pop1() {

		if(top1>=0) {
			top1--;
		}
		else {
			System.out.println("Stack1 is underflow");
			return;
		}
	
	}

	private void push2(int i) {
		if(top1<top2-1) {
			top2--;
			arr[top2] = i;
		}
		else {
			System.out.println("Stack2 is full");
			return;
		}
	}

	private void push1(int i) {
		if(top1<top2-1) {
			top1++;
			arr[top1] = i;
		}
		else {
			System.out.println("Stack1 is full");
			return;
		}
	}

}
