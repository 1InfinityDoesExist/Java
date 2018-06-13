package JavaTutorial;

import java.io.IOException;

abstract class shape {
	abstract void show();
}

class rectangle extends shape {
	public void show() {
		System.out.println("I am rectangle");
	}
}

class circle extends shape {
	public void show() {
		System.out.println("I am circle");
	}
}

class rect extends shape {
	public void show() {
		System.out.println("I am rect");
	}
}

class angle extends shape {
	public void show() {
		System.out.println("I am angle");
	}
}

public class firstProgram {
	public static void main(String[] args) throws IOException {
		shape s = new rect(); // This is upcasting....
		s.show();
		s = new circle();
		s.show();
		s = new angle();
		s.show();
	}

}
