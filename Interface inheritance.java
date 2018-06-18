
//Interface inheritance.....

package JavaTutorial;

interface pr {
	public void show();
}

interface qr {
	public void dekha();
}

interface displayable extends pr, qr {
	public void display();
}

class P implements displayable {
	public void show() {
		System.out.println("Me is in show");
	}

	public void display() {
		System.out.println("Me is in displayable");
	}

	public void dekha() {
		System.out.println("Me is in dekha");
	}

}

public class firstProgram {
	public static void main(String[] args) {
		String str = new String("Doctor");

		P p = new P();
		p.show();
		p.display();
		p.dekha();

	}
}
