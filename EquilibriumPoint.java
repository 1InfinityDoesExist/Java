import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	int findEquilibriumPoint(ArrayList<Integer> ai)
	{
		int sum = 0;
		int left_sum = 0;
		for(int iter = 0; iter < ai.size(); iter++)
		{
			sum = sum + ai.get(iter);
		}

		for(int i = 0; i < ai.size(); i++)
		{
			sum = sum-ai.get(i);
			if(left_sum == sum)
			{
				return i+1;
			}
			left_sum = left_sum + ai.get(i);
		}
		return -1;
	}
	public static void main(String[] args) throws  Exception
	{
		GFG gfg = new GFG();
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
			int equibPoint = gfg.findEquilibriumPoint(ai);
			System.out.println(equibPoint);
		}
	}
}
