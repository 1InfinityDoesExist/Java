
import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public String removeZeros(String str)
	{
		int iter = 0;
		while(iter < str.length() && str.charAt(iter) == '0')
		{
			iter++;
			if(iter == str.length()-1)
			{
				return "";
			}
		}
		StringBuffer sbr = new StringBuffer(str);
		sbr.replace(0, iter, "");

		String ss = sbr.toString();
		return ss;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		GFG gfg = new GFG();
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			String str = input.next();
			System.out.println(gfg.removeZeros(str));
		}
	}
}
