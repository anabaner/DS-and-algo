package StackPrograms;

import java.util.Stack;

public class StackUtils {
	static int top;
	static int capacity;
	static int arr[] ;
	static char arr1[] ;
	
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	
	StackUtils(int size){
		top = -1;
		arr = new int[size];
		arr1 = new char[size];
		capacity = size;
	}
	public  void push(int i ) {
		if(isFull()) {
			System.out.println("Stack is full, cant insert more.. ");
			return;
		}
		else {
			System.out.println("Inserting " + i);
			arr[++top] = i;
		}
	}
	
    private boolean isFull() {
    	if (top+1 == capacity)
    			return true;
    	else
    			return false;
	}
    
	public  int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty, underflow condition..");
			return 0;
		}
		System.out.println("Removing " + peek());
			return arr[top--] ;
	}
	
	private  int peek() {
		if(!isEmpty()) {
			return arr[top];
		}
		return -1;
	}
	
	private  int peekChar() {
		if(!isEmpty()) {
			return arr1[top];
		}
		return -1;
	}
	
	private  boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	public static void show() {
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
	public static void enqueue(int i) {
		
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		} //Move all elements frpm s1 to s2
		
		stack1.push(i); //push to s1
		
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		} //Push back all elements from s2 to s1
		printStack(stack1);
	}
	public static void dequeue() {
		if(stack1.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		stack1.pop();
		printStack(stack1);
	}
	public static void printStack(Stack<Integer> stack) {
		System.out.println("Stack ::"+stack);
	}
	
	public  void push(char i ) {
		if(isFull()) {
			System.out.println("Stack is full, cant insert more.. ");
			return;
		}
		else {
			System.out.println("Inserting " + i);
			arr1[++top] = i;
		}
	}
	public  char popChar() {
		if(isEmpty()) {
			System.out.println("Stack is empty, underflow condition..");
			return 0;
		}
		System.out.println("Removing " + peekChar());
			return arr1[top--] ;
	}
	
}
