package multithreads;

public class MultiThreadApp {

	public static void main(String[] args) {
		
		// Create objects of thread
		Thread numThread = new MultiThread();
		Thread numThread2 = new MultiThread();

		// Named the thread
		numThread.setName("Thread 1");
		numThread2.setName("Thread 2");
		
		// Execute threads
		numThread.start();
		numThread2.start();

	}

}
