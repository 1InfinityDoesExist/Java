import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	void reverseWord(String str)
	{
		Stack<String> ss = new Stack<String>();
		String s = "";
		for(int iter = 0; iter < str.length(); iter++)
		{
			if(str.charAt(iter) == '.')
			{
				if(s.length() == 0)
				{
					continue;
				}
				else
				{
					ss.push(s);
					s = "";
				}
			}
			else
			{
				if(iter == str.length()-1)
				{
					s = s + str.charAt(iter);
					ss.push(s);
				}
				s = s + str.charAt(iter);
			}
		}
		str = "";
		while(!ss.isEmpty())
		{
			if(ss.size() == 1)
			{
				str = str + ss.peek();
				System.out.println(str);
				return;
			}
			str = str + ss.peek();
			str = str + '.';
			ss.pop();
		}
	}
	public static void main(String[] args)
	{
		GFG gfg = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			String str = input.next();
			gfg.reverseWord(str);
		}
	}
}
