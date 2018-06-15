package JavaTutorial;

public class firstProgram {
	public static void main(String[] args) {
		System.out.println("I am the base class");
	}

}

class B extends firstProgram {
	public static void main(String[] args) {
		System.out.println("May hu child class");
	}

}
//Instead of method overriding it is method hiding...because both the parent 
//child class are static in nature...