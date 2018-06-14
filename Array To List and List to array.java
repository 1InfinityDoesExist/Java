package JavaTutorial;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class firstProgram {
	public static void main(String[] args) throws IOException {
		ArrayList<String> str = new ArrayList<String>();
		str.add("Patel");
		str.add("Mishra");
		str.add("Chitransh");
		str.add("Rouyniar");
		str.add("Rehman");
		str.add("Vats");

		// System.out.println(str);

		String[] sarray = str.toArray(new String[0]);
		for (String x : sarray) {
			System.out.print(x + " ");
		}
		System.out.println();

		ArrayList<String> ar = new ArrayList<String>(Arrays.asList(sarray));
		for (String a : ar) {
			System.out.print(a + " ");
		}

		
	}
}
