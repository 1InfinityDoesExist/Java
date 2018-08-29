import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution
{

	public int missingNumber(ArrayList<Integer> ai, final int n)
	{
	    int sum = 0;
		for(int iter = 1; iter <= n; iter++)
		{
		    sum = sum + iter;
		}
		for(int iter = 0; iter < ai.size(); iter++)
		{
		    sum = sum-ai.get(iter);
		}
		return sum;

	}
	public static void main(String[] args)
	{
		Solution sol = new Solution();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			ArrayList<Integer> ai = new ArrayList<Integer>();
			for(int iter = 0; iter < n-1; iter++)
			{
				ai.add(input.nextInt());
			}
			int ans = sol.missingNumber(ai, n);
			System.out.println(ans);
		}
	}
}
