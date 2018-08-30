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
	LinkedList reverseLinkedList(LinkedList head)
	{
		LinkedList prev = null;
		LinkedList current = head;
		LinkedList next;
		while(current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
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
			LinkedList ptr = gfg.reverseLinkedList(head);
			while(ptr != null)
			{
				System.out.print(ptr.data + " ");
				ptr = ptr.next;
			}
		}
	}
}
