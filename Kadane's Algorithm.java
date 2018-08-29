import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {
	int maxSum(ArrayList<Integer> ai) {
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
		for (int iter = 0; iter < ai.size(); iter++) {
			max_ending_here = max_ending_here + ai.get(iter);
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}

		}
		return max_so_far;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while (testCase-- > 0) {
			ArrayList<Integer> ai = new ArrayList<Integer>();
			int n = input.nextInt();
			for (int iter = 0; iter < n; iter++) {
				ai.add(input.nextInt());
			}
			int ans = sol.maxSum(ai);
			System.out.println(ans);
		}
	}
}
