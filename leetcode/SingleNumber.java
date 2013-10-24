/*
Single Number AC Rate: 3449/7510 
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
import java.util.*;

public class SingleNumber {
	public int singleNumber(int[] A) {
		// Note: The Solution object is instantiated only once and is reused by each test case.
		Set<Integer> set = new HashSet<Integer>();
		int sum = 0;

		for (int n: A) {
			//System.out.println(n);
		/*	if (set.contains(n))
				set.remove(n);
			else
				set.add(n);			
		*/
		//	sum += 10^n;
			sum ^= n;
			System.out.println(n + ": " + sum);
		}
		//Iterator<Integer> iter = set.iterator();
		return sum^0;
		//return iter.next();
	}
	
	public static void main (String[] args) {
		int[] numbers = {1,4,3,2,3,1,4};

		SingleNumber sn = new SingleNumber();
		System.out.println(sn.singleNumber(numbers));
	}
}
