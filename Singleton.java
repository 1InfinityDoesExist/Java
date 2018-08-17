
import java.io.*;
import java.lang.*;
import java.util.*;

class Single
{
	private static Single single = null;
	private Single() {}
	public static Single getInstance()
	{
		if(single == null)
		{
			single = new Single();
		}
		return single;
	}
	protected static void display()
	{
		System.out.println("Ye kya hai bhai....");
	}
}
public class Singleton
{
	public static void main(String[] args)
	{
		Single sing = Single.getInstance();
		sing.display();
		Single ting = Single.getInstance();
		ting.display();
	}
}
