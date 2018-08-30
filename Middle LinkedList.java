import java.io.*;
import java.lang.*;
import java.util.*;

class LinkedList
{
	int data;
	LinkedList next;
	LinkedList(int data)
	{
		this.data = data;
		next = null;
	}
}
public class GFG
{
	int getMiddle(LinkedList head)
	{
		int len = 0;
		LinkedList ptr = head;
		while(ptr != null)
		{
			len++;
			ptr = ptr.next;
		}
		ptr = head;
		for(int iter = 0; iter < len/2; iter++)
		{
			ptr = ptr.next;
		}
		return ptr.data;
	}
	public static void main(String[] args)
	{
		GFG gfg = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			LinkedList head = new LinkedList(2);
			head.next = new LinkedList(4);
			head.next.next = new LinkedList(14);
			head.next.next.next = new LinkedList(24);
			head.next.next.next.next = new LinkedList(44);
			head.next.next.next.next.next = new LinkedList(84);
			head.next.next.next.next.next.next = new LinkedList(47);
			head.next.next.next.next.next.next.next = new LinkedList(94);
			head.next.next.next.next.next.next.next.next = new LinkedList(74);
			head.next.next.next.next.next.next.next.next.next = new LinkedList(47);
			int ans = gfg.getMiddle(head);
			System.out.println(ans);
		}
	}
}
