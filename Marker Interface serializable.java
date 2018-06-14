package JavaTutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {
	public String name;
	public int age;
	public String telephoneNumber;

	public Demo(String n, int k, String tn) {
		this.name = n;
		this.age = k;
		this.telephoneNumber = tn;
	}
}

public class firstProgram {

	public static void main(String[] args) throws IOException {
		Demo dm = new Demo("Avinash", 14, "9876543210");
		String fileName = "file.ser";

		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(dm);
			out.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Demo object_new = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			object_new = (Demo) in.readObject();
			file.close();
			in.close();

			System.out.println(object_new.name);
			System.out.println(object_new.age);
			System.out.println(object_new.telephoneNumber);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
