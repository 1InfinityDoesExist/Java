package JavaTutorial;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class firstProgram {
	public static void main(String[] args) throws IOException {

		// first way...

		Set lhs = new TreeSet();
		lhs.add("Jaiswal");
		lhs.add("Piyush");
		lhs.add("Avinash");

		System.out.println(lhs);

		Iterator iter = lhs.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}
		System.out.println();

		// The other way...

		Set<String> s = new TreeSet<String>();
		s.add("Jaiswal");
		s.add("Piyush");
		s.add("Avinash");

		System.out.println(s);

		Iterator itt = s.iterator();
		while (itt.hasNext()) {
			System.out.print(itt.next() + "  ");
		}

		System.out.println();

		// second way...

		TreeSet lh = new TreeSet();
		lh.add("Jaiswal");
		lh.add("Piyush");
		lh.add("Avinash");

		System.out.println(lh);
		Iterator i = lh.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + "  ");
		}
		System.out.println();

		// third way...

		TreeSet<String> l = new TreeSet<String>();
		l.add("Jaiswal");
		l.add("Piyush");
		l.add("Avinash");

		System.out.println(l);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
		System.out.println();
	}

}
