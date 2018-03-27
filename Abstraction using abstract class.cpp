//Abstraction using abstract class

abstract class A {
	abstract void display();

	public void show() {// this one is concrete method.....
		System.out.println("hey i am abstract class");
	}
}

class B extends A {
	public void display() {
		System.out.println("Kaise ho");
	}
}

public class Test {

	public static void main(String[] args) {

		A a = new B();
		a.display();
	}
}
