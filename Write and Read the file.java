package JavaTutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class firstProgram {
	public static void main(String[] args) throws IOException {
		File F1 = new File("C:/Users/DELL/workspace/Text.txt");
		String st = "Write to the File";
		FileWriter fw = new FileWriter(F1);
		fw.write(st);
		fw.close();

		File F2 = new File("C:/Users/DELL/workspace/Text.txt");
		FileReader fr = new FileReader(F2);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		fr.close();

	}
}
