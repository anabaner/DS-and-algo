package QueuePrograms;

public class QueueImpl {

	public static void main(String[] args) {
		Queue q= new Queue(5);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println("peek::"+q.peek());
		q.dequeue();
		System.out.println("peek::"+q.peek());
		q.size();
		/*
		 * q.enqueue(5); q.dequeue(); q.dequeue(); q.enqueue(5); q.enqueue(6);
		 * q.enqueue(7); q.enqueue(8);
		 */
		
	}

}
class Queue{

	int[] arr;
	int capacity; // how much queue can hold 
	int front;
	int rear;
	int count; // how much currently holding
	
	public Queue(int capacity) {
		arr = new int[capacity];
		this.capacity = capacity;
		front = 0;
		rear = -1;
		count = 0;
	}
	public boolean isEmpty() {
			return count==0;
	}
	
	public boolean isFull() {
		return count == capacity;
	}
	public int size() {
		return count ;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("overflow condition");
		}
		
		else {
			rear = (rear+1)% capacity;
			arr[rear] = data;
			System.out.println("enqueued:: "+data);
			count++;
		
		}
	}
	public int dequeue() {
		int x=0;
		if(isEmpty()) {
			System.out.println("underflow condition");
		}
		else {
			x=  arr[front];
			System.out.println("dequeued:: "+x);
			front = (front+1)%capacity;
			count--;
		}
		return x;
	}
	public int peek() { // return front element of queue
		if(isEmpty()) {
			System.out.println("underflow condition");
		}
		return arr[front];
	}
}
