package JavaTutorial;

import java.io.IOException;

class Base {
	Base() {
		this(10);
	}

	Base(int x) {
		System.out.println(x);
	}
}

public class firstProgram {
	public static void main(String[] args) throws IOException {
		Base b = new Base();
	}
}
