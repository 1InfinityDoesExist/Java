//Longes Common SubSequence

import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public int LCS(String str1, String str2)
	{
		int len1 = str1.length();
		int len2 = str2.length();
		int[][] dp = new int[len1+1][len2+1];
		for(int iter = 0; iter <= len1; iter++)
		{
			for(int jter = 0; jter <= len2; jter++)
			{
				if(iter == 0 || jter == 0)
				{
					dp[iter][jter] = 0;
				}
				else if(str1.charAt(iter-1) == str2.charAt(jter-1))
				{
					dp[iter][jter] = dp[iter-1][jter-1] + 1;
				}
				else
				{
					dp[iter][jter] = Math.max(dp[iter-1][jter] , dp[iter][jter-1]);
				}
			}
		}
		return dp[len1][len2];
	}
	public static void main(String[] args) throws IOException
	{
		GFG gfg = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int m = input.nextInt();
			int n = input.nextInt();
			String str1 = input.next();
			String str2 = input.next();
			int ans = gfg.LCS(str1, str2);
			System.out.println(ans);
		}
	}
}
