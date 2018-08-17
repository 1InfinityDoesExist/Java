import java.io.*;
import java.lang.*;
import java.lang.*;

class Base implements Runnable
{
	public void run()
	{
		System.out.println("Hey I am thread");
	}
}
class base extends Thread
{
	public void run()
	{
		System.out.println("Hey I am base ka thread");
	}
}
public class GFG
{
	public static void main(String[] args)
	{
		GFG gfg = new GFG();
		/*Base b = new Base();
		Thread thread = new Thread(b);
		thread.start();
		*/

		base bb = new base();
		bb.start();
	}
}
