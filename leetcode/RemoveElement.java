/*
Remove Element Total Accepted: 2543 Total Submissions: 7593 My Submissions
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/
/**
Submission Result: Wrong Answer

 Input:		[4,5], 4
 Output:	[4]
 Expected:	[5]
*/

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
		//int len = A.length;
		int len = 0;

		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
			if (A[i] != elem) A[len++] = A[i];
			
		}
		return len;
	}

	public static void print(int[] A) {
		for(int n: A) {
			System.out.print(n + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RemoveElement re = new RemoveElement();
		//int[] A = {1, 9, 2, 3, 9};
		//int[] A = {9, 9, 9};
		//int[] A = {9, 8, 9, 9, 9, 2};
		int[] A = {4, 5};
		int elem = 9;
		elem = 4;

		print(A);
		System.out.println("new length = " + re.removeElement(A, elem));
		print(A);
	}
}
