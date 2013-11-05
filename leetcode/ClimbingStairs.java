/*
Climbing Stairs Total Accepted: 2614 Total Submissions: 7829 My Submissions
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
// 1 2 3 5 8 13 ...
public class ClimbingStairs{
	public int climbStairs(int n) {
		if (n <= 1) return n;
		int sum = 1;
		int prev = 1;
		int prevprev = 1;
		for(int i = 1; i < n; i ++) {
			sum = prev + prevprev;
			System.out.println(prev + "+" + prevprev + "=" + sum);
			prevprev = prev;
			prev = sum;
		}
		return sum;
	}
	public static void main(String[] args) {
		ClimbingStairs cs = new ClimbingStairs();
		int n = 7;
		n = 2;
		n = 3;
		n = 6;
		System.out.println(cs.climbStairs(n));
	}
}
