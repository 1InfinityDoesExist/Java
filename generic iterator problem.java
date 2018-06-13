package JavaTutorial;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

public class firstProgram {
	public static void main(String[] args) throws IOException {
		LinkedList ls = new LinkedList();
		// ls.add(2014);
		ls.add("Dimple");
		ls.add("Looks");
		ls.add("So");
		ls.add("Simple");
		ls.add('A');

		ls.add(002);
		ls.add(014);

		System.out.println(ls); // works well
/* gives you error it you use iterator.....
		ListIterator<String> iter = ls.listIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
*/
	}
}
