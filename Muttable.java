import java.io.*;
import java.lang.*;
import java.util.*;

class mutable
{
	private String Name;
	private int RegNo;
	mutable(String Name, int RegNo)
	{
		this.Name = Name;
		this.RegNo = RegNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRegNo() {
		return RegNo;
	}
	public void setRegNo(int regNo) {
		RegNo = regNo;
	}
}
public class Muttable
{
	public static void main(String[] args)
	{
		mutable m = new mutable("Saroj", 7);
		m.setName("Rakesh");
		System.out.println(m.getName());

	}
}
