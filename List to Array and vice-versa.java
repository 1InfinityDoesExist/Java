package JavaTutorial;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class firstProgram {
	public static void main(String[] args) throws IOException {
		String[] str = { "Avinah", "Patel", "Rocks", "Shiker", "Bikey", "Vats" };
		LinkedList<String> ls = new LinkedList<String>(Arrays.asList(str));
		for (String x : ls) {
			System.out.print(x + " ");
		}
		System.out.println();
		String[] ptr = ls.toArray(new String[0]);
		for (int iter = 0; iter < ptr.length; iter++) {
			System.out.print(ptr[iter] + " ");
		}

	}
}
