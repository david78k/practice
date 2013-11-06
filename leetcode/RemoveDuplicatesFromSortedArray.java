/*
Remove Duplicates from Sorted Array Total Accepted: 2889 Total Submissions: 8645 My Submissions
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
*/

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] A) {
		int len = A.length;

		if(len < 2) return len;

		int i = 0, end = 1;

		System.out.print(A[i] + ", ");

		while (end < len) {
			System.out.print(A[end] + ", ");
			
			if(A[end] != A[i]) 
				A[++i] = A[end];

			end ++;
		}
		System.out.println(A[len - 1]);

		return i + 1;
	}

	public static void print(int[] A) {
		for(int a: A) System.out.print(a + ", ");
		System.out.println();
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray array = new RemoveDuplicatesFromSortedArray();
		//int[] A = {};
		//int[] A = {1};
		//int[] A = {1,2};
		//int[] A = {1,1,2};
		//int[] A = {1,1,1,2};
		int[] A = {1,1,1,1};
		//int[] A = {1,1,1,2,2,3,3};
		//int[] A = {1,1,1,2,2,3,3,4};
		//int[] A = {1,1,1,2,2,3,4,4,4};
		//int[] A = {1,1,1,2,2,3,3,4,5};
		//int[] A = {1,1,1,2,2,3,3,4,5,5};

		print(A);
		System.out.println("new length = " + array.removeDuplicates(A));
		print(A);
	}
}
