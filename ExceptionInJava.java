import java.io.*;
import java.lang.*;
import java.util.*;

class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}
public class Except_ion
{
	public static void main(String[] args)
	{
		int num =  2;
		int deno = 0;
		try
		{
			throw new MyException("Thow kar...");
		}
		catch(MyException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
