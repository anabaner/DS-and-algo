package Practice;

public class ThreadWaitNotifyExample {

	public static void main(String[] args) {

		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b) {
			try {
				System.out.println("Waiting for thread B to complete");
				b.wait();
			}
			catch(Exception e ) {
				System.out.print(e);
			}
			System.out.print(b.total);
		}
	}

}

class ThreadB extends Thread{
	int total;
	public void run() {
		synchronized(this) {
			for(int i=0;i<10;i++) {
				total=total+i;
				//System.out.println("Take:; "+i);
			}
			notify();
		}
	}
	
}
