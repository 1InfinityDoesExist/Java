import java.io.*;
import java.lang.*;
import java.util.*;

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
class Pair
{
	TreeNode node;
	int x;
	Pair(TreeNode node, int x)
	{
		this.node = node;
		this.x = x;
	}
}
public class GFG
{
	void printBottomView(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		Map<Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();
		Queue<Pair>q = new LinkedList<Pair>();
		Pair p = new Pair(root, 0);
		q.add(p);
		while(!q.isEmpty())
		{
			Pair temp = q.peek();
			q.poll();
			int hd = temp.x;
			TreeNode node = temp.node;

			Integer val = mp.get(hd);
			if(val == null)
			{
				System.out.println(node.data);
				mp.put(hd, 1);
			}

			if(node.left != null)
			{
				q.add(new Pair(node.left, hd-1));
			}
			if(node.right != null)
			{
				q.add(new Pair(node.right, hd+1));
			}
		}
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
		gfg.printBottomView(root);
	}
}
