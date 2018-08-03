import java.io.*;
import java.lang.*;
import java.util.*;

public class CollectionsPractise 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(14);
		al.add(24);
		al.add(19);
		al.add(35);
		ListIterator<Integer> iter = al.listIterator(2);
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
