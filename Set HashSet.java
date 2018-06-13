package JavaTutorial;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class firstProgram {
	public static void main(String[] args) throws IOException {
		// first way
		Set<Integer> hsi = new HashSet<Integer>();
		hsi.add(2);
		hsi.add(3);
		hsi.add(4);
		hsi.add(14);
		hsi.add(19);
		hsi.add(24);

		System.out.println(hsi);// Print the data in random order...

		Iterator iter = hsi.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}
		// second way
		Set hs = new HashSet();
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(14);
		hs.add(19);
		hs.add(24);

		System.out.println(hs);// Print the data in random order...

		Iterator i = hs.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + "  ");
		}

		// third way....
		System.out.println();
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(14);
		h.add(19);
		h.add(24);

		System.out.println(h);

	}

}
