package Practice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerExample extends Thread {

	public static void main(String[] args) {
		
		BlockingQueue q = new LinkedBlockingQueue() ;
		
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		Thread prodThread = new Thread(p);
		Thread conThread = new Thread(c);
		
		prodThread.start();
		conThread.start();
		
		
	}

}

class Producer implements Runnable{
	private BlockingQueue q;
	public Producer(BlockingQueue q) {
		this.q = q;
	}
	@Override
	public void run() {
		int i;
		for(i=0;i<10;i++)
		System.out.println("Produced:: "+i);
		try {
			
			Thread.sleep(200);
			q.put(i);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

class Consumer implements Runnable{
	private BlockingQueue q;

	public Consumer(BlockingQueue q) {
		this.q=q;
	}

	@Override
	public void run() {
		while(true) {
		try {
			System.out.println("Consumed:: "+q.take());
			Thread.sleep(100);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}
}