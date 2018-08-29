import java.io.*;
import java.lang.*;
import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;

class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int val)
	{
		data = val;
		left = null;
		right = null;
	}
}

public class GFG
{
	void printLeftBoundary(TreeNode root)
	{
		if(root != null)
		{
			if(root.left != null)
			{
				System.out.println(root.data);
				printLeftBoundary(root.left);
			}
			else if(root.right != null)
			{
				System.out.println(root.data);
				printLeftBoundary(root.right);
			}
		}
	}
	void printRoot(TreeNode root)
	{
		if(root != null)
		{
			if(root.left != null)
			{
				printRoot(root.left);
			}
			if(root.left == null && root.right == null)
			{
				System.out.println(root.data);
			}
			if(root.right != null)
			{
				printRoot(root.right);
			}
		}

	}
	void printRightBoundary(TreeNode root)
	{
		if(root != null)
		{
			if(root.right != null)
			{
				printRightBoundary(root.right);
				System.out.println(root.data);
			}
			else if(root.left != null)
			{
				printRightBoundary(root.left);
				System.out.println(root.data);
			}
		}
	}
	void Boundary(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		System.out.println(root.data);
		printLeftBoundary(root.left);
		System.out.println("root");
		printRoot(root);
		System.out.println("right");
		printRightBoundary(root.right);
		return;
	}
	public static void main(String[] args)
	{
		GFG gfg = new GFG();
		Scanner input = new Scanner(System.in);

		TreeNode root = new TreeNode(50);
		root.left = new TreeNode(30);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(40);
		root.right = new TreeNode(80);
		root.right.left = new TreeNode(60);
		root.right.right = new TreeNode(100);
		gfg.Boundary(root);
	}
}
