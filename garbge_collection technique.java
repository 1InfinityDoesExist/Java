package JavaTutorial;

import java.io.IOException;

class Base {
	Base() {

	}

	void display() {
		System.out.println("Hey how are you");
	}
}

public class firstProgram {
	public static void main(String[] args) throws IOException {
		Base b = new Base();
		b = null;
		System.gc();//this garbage collection...
		Base bk = new Base();
		bk = null;
		Runtime.getRuntime().gc(); // this garbage collection...
	}
}
