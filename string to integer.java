package JavaTutorial;

import java.io.IOException;

public class firstProgram {
	public static void main(String[] args) throws IOException {
		String str = "014";
		Integer i = Integer.parseInt(str);
		System.out.println(i);
		Integer j = Integer.valueOf(str);
		System.out.println(j);

	}
}
