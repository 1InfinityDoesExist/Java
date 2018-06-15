package JavaTutorial;

public class firstProgram {
	public static void main(String[] args) {
		String str = new String("Doctor");

		// uncomment below and see what happen....
		// String kter = str.concat(" Engineer");
		// System.out.println(kter);
		System.out.println(str);

		StringBuffer br = new StringBuffer("Om Prakash");
		br.append("Bahi Jinda Bad");
		System.out.println(br);

		StringBuilder sbr = new StringBuilder("Shah");
		sbr.append(" ManMohan");
		System.out.println(sbr);

		// conversion stringBufferd -> string -> stringBuilder
		String s = new String(br);// stringBuffered to string
		StringBuilder br0 = new StringBuilder(s);//string to stirngBuilder
		System.out.println(br0);

	}
}
