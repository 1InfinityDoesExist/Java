//static 

package JavaTutorial;

import java.io.IOException;

class Base {
	Base() {
	}

	private String firstName;
	private String lastName;
	private static int member = 0;

	Base(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		member++;
	}

	public String toString() { // use of toString
		return firstName + " " + lastName + " " + member;
	}
}

public class firstProgram {
	public static void main(String[] args) throws IOException {
		Base b = new Base("Avinash", "Patel");
		System.out.println(b); // This is how toString is used...
	}
}
