import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	int LCSubstring(String str1, String str2)
	{
		int l1 = str1.length();
		int l2 = str2.length();
		int[][] dp = new int[l1+1][l2+1];
		int len = 0;
		for(int iter = 0; iter <= l1; iter++)
		{
			for(int jter = 0; jter <= l2; jter++)
			{
				if(iter == 0 || jter == 0)
				{
					dp[iter][jter] = 0;
				}
				else if(str1.charAt(iter-1) == str2.charAt(jter-1))
				{
					dp[iter][jter] = 1 + dp[iter-1][jter-1];
					len = Math.max(len, dp[iter][jter]);
				}
				else
				{
					dp[iter][jter] = 0;
				}
			}
		}
		return len;
	}
	public static void main(String[] args)
	{
		GFG gfg = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
		    int n = input.nextInt();
		    int m = input.nextInt();
			String str1 = input.next();
			String str2 = input.next();
			int ans = gfg.LCSubstring(str1, str2);
			System.out.println(ans);
		}
	}
}
