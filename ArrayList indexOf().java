import java.io.*;
import java.lang.*;
import java.util.*;

public class CollectionsPractise 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(14);
		al.add(24);
		al.add(19);
		al.add(35);
		al.add(2);
		al.add(44);
		al.add(14);
		al.add(24);
		al.add(4);
		al.add(14);
		
		int index = al.indexOf(14);
		System.out.println(index);
	}
}
