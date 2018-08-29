import java.io.*;
import java.lang.*;
import java.util.*;
public class solving
{
	int partition(ArrayList<Integer> ai, int low , int high)
	{
		int pivot = ai.get(high);
		int iter = low-1;
		for(int jter = low; jter < high; jter++)
		{
			if(ai.get(jter) < pivot)
			{
				iter++;
				int temp = ai.get(iter);
				ai.set(iter, ai.get(jter));
				ai.set(jter, temp);
			}
		}
		int temp = ai.get(iter+1);
		ai.set(iter+1, ai.get(high));
		ai.set(high, temp);
		return iter+1;
	}
	void quicksort(ArrayList<Integer> ai, int start , int end)
	{
		if(start < end)
		{
			int pi = partition(ai, start, end);
			quicksort(ai, start, pi-1);
			quicksort(ai, pi+1, end);
		}
	}
	void sort(ArrayList<Integer> ai)
	{
		int start = 0;
		int end = ai.size()-1;
		quicksort(ai, start , end);
	}

	public static void main(String[] args)
	{
		solving solve = new solving();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			ArrayList<Integer> ai = new ArrayList<Integer>();
			for(int iter = 0; iter < n; iter++)
			{
				ai.add(input.nextInt());
			}
			solve.sort(ai);
			Iterator iter = ai.iterator();
			while(iter.hasNext())
			{
				System.out.print(iter.next() + " ");
			}
		}
	}
}
