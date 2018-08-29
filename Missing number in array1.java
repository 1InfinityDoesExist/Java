import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution
{
	public int swap(int a, int b)
	{
		return a;
	}
	public int missingNumber(ArrayList<Integer> ai)
	{

		for(int iter = 0; iter < ai.size(); iter++)
		{
			if(ai.get(iter) > 0 && ai.get(iter) <= ai.size())
			{
				int pos = ai.get(iter);
				if(pos < ai.size() && ai.get(pos) != ai.get(iter))
				{
					ai.set(pos, swap(ai.get(iter), ai.set(iter, ai.get(pos))));
					iter--;
				}
			}
		}
		int iter;
		for(iter = 1; iter < ai.size(); iter++)
		{
			if(ai.get(iter) != iter)
			{
				return iter;
			}
		}
		if(ai.get(0) == ai.size())
		{
			return ai.size()+1;
		}
		return iter;
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
			int ans = sol.missingNumber(ai);
			System.out.println(ans);
		}
	}
}
