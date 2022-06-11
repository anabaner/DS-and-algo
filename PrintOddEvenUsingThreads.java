package MSInterview;

public class PrintOddEvenUsingThreads extends Thread {

	static int n;
	static int counter = 1;
	
	public static void main(String[] args) {
		n=10;
		PrintOddEvenUsingThreads pt = new PrintOddEvenUsingThreads();
		Thread t1= new Thread(new Runnable() {

			@Override
			public void run() {
				pt.printOddNumber();	
			}

			
		});
		
		Thread t2= new Thread(new Runnable() {

			@Override
			public void run() {
				pt.printEvenNumber();	
			}
			
		});
		
		t1.start();
		t2.start();
	}
	
	private synchronized void printOddNumber() {
		while(counter<n) {
			while(counter%2 ==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(counter);
			counter++;
			notify();
		}
		
		
	}
	
	private synchronized  void printEvenNumber() {
		while(counter<n) {
			while(counter%2 ==1) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(counter);
			counter++;
			notify();
		}
		
		
	}

}
