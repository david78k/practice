/*
Search Insert Position Total Accepted: 2604 Total Submissions: 7720 My Submissions
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 ??2
[1,3,5,6], 2 ??1
[1,3,5,6], 7 ??4
[1,3,5,6], 0 ??0

*/

public class SearchInsertPosition {
	public int searchInsert(int[] A, int target) {
		int i;

		if (A == null) return 0;
		if (A.length == 0) return 0;

		for (i = 0; i < A.length; i ++) {
			if (A[i] >= target) return i;
			System.out.println(i);
		}

		if (A[i - 1] < target) return i;
		return 0;
	}

	public static void main(String[] args) {
		SearchInsertPosition sip = new SearchInsertPosition();
		//int[] A = {1, 3, 5, 6};
		//int[] A = {1};
		int[] A = {};
		A = null;
		int target = 7;	
		//target = 5;	
		//target = 2;	
		//target = 0;	
		System.out.println("target = " + target);
		System.out.println("index = " + sip.searchInsert(A, target));
	}
}
