package JavaTutorial;

import java.util.ArrayList;

public class firstProgram {
	public static void main(String[] args) {
		ArrayList<String> as = new ArrayList<String>();
		as.add("Shikher");
		as.add("Bikey");
		as.add("Vats");
		as.add("Rishab");
		as.add("Rainessa");
		as.add("Neha");
		// simple copying list to array using preDefined Funciton....
		String[] str = as.toArray(new String[0]);

		for (String y : str) {
			System.out.println(y);
		}

		// farzi ka kam..
		String[] arr = new String[as.size()];
		int iter = 0;
		for (String s : as) {
			arr[iter++] = s;
		}
		for (String k : arr) {
			System.out.println(k);
		}
	}
}
