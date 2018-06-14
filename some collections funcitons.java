package JavaTutorial;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class firstProgram {
	public static void main(String[] args) throws IOException {
		String[] str = { "Avinah", "Patel", "Rocks", "Avinah", "Patel", "Rocks", "Shiker", "Bikey", "Vats" };
		ArrayList<String> ls = new ArrayList<String>(Arrays.asList(str));
		for (String x : ls) {
			System.out.print(x + " ");
		}
		String[] st = { "Kuch ", " Nahi ", "Match ", "Karega" };
		ArrayList<String> lt = new ArrayList<String>(Arrays.asList(st));
		// sort...
		Collections.sort(ls);
		System.out.println();
		for (String x : ls) {
			System.out.print(x + " ");
		}

		// sort reverse order...
		Collections.reverse(ls);
		System.out.println();
		for (String x : ls) {
			System.out.print(x + " ");
		}
		// Number of times the word is occuring...
		System.out.println(Collections.frequency(ls, "Patel"));
		
		//disjoint
		System.out.println(Collections.disjoint(ls, lt));
	}
}
