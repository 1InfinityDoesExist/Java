import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public String LCPrefix(ArrayList<String> ai)
	{
		String ans = "";
		String chotaString = null;
		int chotaStringLength = Integer.MAX_VALUE;
		for(int iter = 0; iter < ai.size(); iter++)
		{
			String str = ai.get(iter);
			int len = str.length();
			if(len < chotaStringLength)
			{
				chotaStringLength = len;
				chotaString = ai.get(iter);
			}
		}
		for(int iter = 0; iter < chotaStringLength; iter++)
		{
			int count = 0;
			char c = chotaString.charAt(iter);
			for(int jter = 0; jter < ai.size(); jter++)
			{
				String ss = ai.get(jter);
				if(ss.charAt(iter) == c)
				{
					count++;
				}
			}
			if(count == ai.size())
			{
				ans = ans + c;
			}
			else
			{
				break;
			}
		}
		if(ans.length() != 0)
		{
			return ans;
		}
		else
		{
			return "-1";
		}
	}
	public static void main(String[] args)
	{
		GFG gfg = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			ArrayList<String> ai = new ArrayList<String>();
			for(int iter = 0; iter < n; iter++)
			{
				ai.add(input.next());
			}
			String ans = gfg.LCPrefix(ai);
			System.out.println(ans);
		}
	}
}
