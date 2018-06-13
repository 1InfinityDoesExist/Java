package JavaTutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstProgram {
	public static void main(String[] args) throws IOException {
		String ch;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			ch = br.readLine();
			System.out.println(ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
