//static 

package JavaTutorial;

import java.io.IOException;

class Base {
	Base() {
		this(50);
	}

	Base(int p) {
		this(10, 15);
		System.out.println(p);
	}

	Base(int x, int y) {
		System.out.println(x + " " + y);
	}
}

public class firstProgram {
	public static void main(String[] args) throws IOException {
		Base b = new Base();
	}
}
