package JavaTutorial;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class firstProgram {
	public static void main(String[] args) throws IOException {

		// first way...
		Set lhs = new LinkedHashSet();
		lhs.add("Jaiswal");
		lhs.add("Piyush");
		lhs.add("Avinash");
		lhs.add(14);

		System.out.println(lhs);

		Iterator iter = lhs.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}

		// The other way...
		Set<String> s = new LinkedHashSet<String>();
		s.add("Jaiswal");
		s.add("Piyush");
		s.add("Avinash");

		System.out.println(s);

		Iterator itt = s.iterator();
		while (itt.hasNext()) {
			System.out.print(itt.next() + "  ");
		}
		// second way...
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("Jaiswal");
		lh.add("Piyush");
		lh.add("Avinash");
		lh.add(14);
		lh.add(48);

		System.out.println(lh);
		Iterator i = lh.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + "  ");
		}
		// third way...
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		l.add("Jaiswal");
		l.add("Piyush");
		l.add("Avinash");

		System.out.println(l);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
	}

}
