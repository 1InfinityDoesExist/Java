package JavaTutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstProgram {
	public static void main(String[] args) throws IOException {
		char ch;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			ch = (char) br.read();
			System.out.println(ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
