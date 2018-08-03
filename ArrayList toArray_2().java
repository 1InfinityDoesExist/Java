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
		
		Integer[] arr = new Integer[al.size()];
		arr = al.toArray(arr);
		
		for(Integer x : arr)
		{
			System.out.println(x);
		}
		/*Object[] obj = al.toArray();
		for(Object x : obj)
		{
			System.out.println(x);
		}
		*/
	}
}
