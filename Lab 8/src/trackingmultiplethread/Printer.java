package trackingmultiplethread;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Printer implements Runnable {

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
			reorderText += arr[(int) textOrderArr[i]] + " ";
		}
		System.out.println(reorderText);

	}

	public void extractText() {
		
		String text = "What is this?";
		String tempText = "";
		char extractChar;
		
		for (int i = 0; i<10; i++){
			
			extractChar = text.charAt(i);
			tempText += extractChar;
			System.out.println(tempText);
			
		}

	}

	@Override
	public void run() {
		Thread curThread = Thread.currentThread();		
		if (curThread.getName().equals("text"))
			extractText();
		else 
			randomOrderText();
	}


}