package sleepthread;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SleepThread implements Runnable {

	private static boolean status = false;

	public void randomOrderText() {
	
		String arr[] = { "It", "is", "recommended", "to", "use", "Calendar", "class" };
		Random randNum = new Random();
		// set is used to avoid duplicate data
		Set<Integer> set = new LinkedHashSet<Integer>();

		while (set.size() < arr.length) {

			set.add(randNum.nextInt(arr.length));
		}

		Object textOrderArr[] = set.toArray();

		String reorderText = "";
		for (int i = 0; i < arr.length; i++) {
			status = true;
			reorderText += arr[(int) textOrderArr[i]] + " ";
			System.out.println(reorderText);
		}		
	}

	public void randomOrderText(String threadName) {
		
			String arr[] = { "It", "is", "recommended", "to", "use", "Calendar", "class" };
			Random randNum = new Random();
			// set is used to avoid duplicate data
			Set<Integer> set = new LinkedHashSet<Integer>();

			while (set.size() < arr.length) {

				set.add(randNum.nextInt(arr.length));
			}
			
			Object textOrderArr[] = set.toArray();

			String reorderText = "";
			for (int i = 0; i < arr.length; i++) {
				reorderText += arr[(int) textOrderArr[i]] + " ";
				try {	
					if (status == true) {
						// suspend current thread for 5 seconds
						System.out.println("\n\n"+ threadName + " is sleeping\n\n");
						Thread.sleep(5000);
						status = false;
					}

				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(threadName + " : " + reorderText);
			}
	}

	public void extractText() {

		String text = "What is this?";
		String tempText = "";
		char extractChar;

		for (int i = 0; i < 10; i++) {

			extractChar = text.charAt(i);
			tempText += extractChar;
			System.out.println(tempText);
		}
	}
	@Override
	public void run() {
		Thread curThread = Thread.currentThread();
		String name = curThread.getName();
		if (name.equals("text"))
			extractText();
		else if (name.equals("word1"))
			randomOrderText();
		else
			randomOrderText(curThread.getName());
	}
}
