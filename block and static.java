package JavaTutorial;

import java.io.IOException;

class A {
	static int i = 120;
	static {
		i = i-- - --i;
		System.out.println(i);
	}
	{
		i = i++ + ++i;
	}
}

public class firstProgram {
	public static void main(String[] args) throws IOException {
		A a = new A();
	}
}
