import java.io.*;
import java.lang.*;
import java.util.*;

class MyThread implements Runnable
{
	String name;
	Thread t;
	MyThread(String thread)
	{
		name = thread;
		t = new Thread(this, name);

		System.out.println("New Thread : " + t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int iter = 5; iter > 0; iter--)
			{
				System.out.println(name + ": " + iter);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name +" "+ "Interrupted");
		}
		System.out.println(name +" "+ "Existing");
	}
}
public class GFG
{
	public static void main(String[] args)
	{
		GFG gfg = new GFG();
		new MyThread("One");
		new MyThread("Two");
		new MyThread("Three");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Existing");
	}
}
