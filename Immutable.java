import java.io.*;
import java.lang.*;
import java.util.*;

final class Immutable {
	final String name;
	final int regNo;

	Immutable(String name, int regNo) {
		this.name = name;
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}
}

public class ImmutableObject {
	public static void main(String[] args) {
		Immutable s = new Immutable("ABC", 101);
		System.out.println(s.name);
		System.out.println(s.regNo);
	}
}
