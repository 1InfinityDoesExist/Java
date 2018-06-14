package JavaTutorial;

import java.io.IOException;

enum WeekDays {
	sun, mon, tues, wed, thur, fri, sat
};

public class firstProgram {
	public static void main(String[] args) throws IOException {
		WeekDays wk = WeekDays.sun;
		System.out.println("Today is -->" + "  " + wk);
	}
}
