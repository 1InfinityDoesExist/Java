package JavaTutorial;

import java.io.IOException;
import java.util.Arrays;

public class firstProgram {
	public static void main(String[] args) throws IOException {
		String str = "Avinash";
		char[] c = str.toCharArray();
		Arrays.sort(c);
		for (char x : c) {
			System.out.print(x + " ");
		}

	}
}
