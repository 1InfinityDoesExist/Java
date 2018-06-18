
//Multiple inheritance in java...

package JavaTutorial;

interface pr {
	public void show();
}

interface displayable {
	public void display();
}

class P implements pr, displayable {
	public void show() {
		System.out.println("Me is in show");
	}

	public void display() {
		System.out.println("Me is in displayable");
	}

}

public class firstProgram {
	public static void main(String[] args) {
		String str = new String("Doctor");

		P p = new P();
		p.show();
		p.display();

	}
}
