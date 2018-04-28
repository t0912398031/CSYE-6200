package neu.edu.csye6200;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwoAlternatingThreads {
	
	public void charThread() {
		char[] alphabet = new char[26];
		for (char c = 'a'; c <= 'z'; c++) {
			alphabet[c - 'a'] = c;
		}
		List<String> listS = new ArrayList<String>();
	    for (char c : alphabet) {  	
	        listS.add(String.valueOf(c));
	    }
		
		Runnable r1 = () -> {

			for(int i=0;i<listS.size();i++) {
				System.out.print(listS.get(i));	
				synchronized (this) {
					try {
						Thread.sleep(100); // milliseconds
					} catch (InterruptedException e) {
						e.printStackTrace();
				
					}
				}
			}
		};
		
		Runnable r2 = () -> {
			
			List<String> upperlist = listS.stream().map(String::toUpperCase).collect(Collectors.toList());		
			
			for(int i=0;i<upperlist.size();i++) {
				System.out.print(upperlist.get(i));	
				synchronized (this) {
					try {
						Thread.sleep(100); // milliseconds
					} catch (InterruptedException e) {
						e.printStackTrace();
				
					}
				}
			}
					
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
	
	public static void demo() {
		TwoAlternatingThreads tat = new TwoAlternatingThreads();
		tat.charThread();
	}
}
