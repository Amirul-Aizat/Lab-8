package multithreads;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class MultiThread extends Thread{

	public void printNum (String currentThreadName)
	{
		LocalTime time = LocalTime.now();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String formattedTime = time.format(timeFormatter);
	    
		for(int i=0 ; i<10 ;i++)
		{
			System.out.println("Round " + i + " : " + currentThreadName + " at " + formattedTime );
		}
	}
	
	public void run ()
	{
		// Get current thread
		Thread currentThread = Thread.currentThread();
				
		// Execute task
		printNum(currentThread.getName());
	}
	
}
