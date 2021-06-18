package sleepthread;

public class SleepThreadApp {

	public static void main(String[] args) {

		// Create object of Runnable
		Runnable statement1 = new SleepThread();
		Runnable statement2 = new SleepThread();
		Runnable statement3 = new SleepThread();

		// Create object of Thread
		Thread word1 = new Thread(statement1, "word1");
		Thread word2 = new Thread(statement2, "word2");
		Thread text = new Thread(statement3, "text");

		word1.start();
	
		text.start();
		word2.start();

	}

}
