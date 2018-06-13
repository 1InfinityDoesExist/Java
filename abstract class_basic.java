package JavaTutorial;

import java.io.IOException;

abstract class A {// must be abstract and method...
	abstract void display();// you cannot write the body.
}

class B extends A {// if you inherit abstract class method you have to define it
					// here...
	public void display() {
		System.out.println("Hey Man whatsupp");
	}
}

public class firstProgram {
	public static void main(String[] args) throws IOException {
		// A a = new A(); abstract class cannot be instintiated...
		B b = new B();
		b.display();
	}

}
