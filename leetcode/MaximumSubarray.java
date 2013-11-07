/*
Maximum Subarray Total Accepted: 2836 Total Submissions: 8605 My Submissions
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

click to show more practice.

More practice:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

public class MaximumSubarray {
    public int maxSubArray(int[] A) {
		int sum = 0;
		int ret = A[0];

		for (int i = 0; i < A.length; i ++) {
			sum = Math.max(A[i], sum + A[i]);
			ret = Math.max(sum, ret);
		}

		return ret;
	}

    public int maxSubArray2(int[] A) {
		if(A == null) return 0;

		int len = A.length;

		if(len == 0) return 0;

		int max = A[0];
		int n = max;
		int begin = 0, end = 0;
		int subsum = 0;

		System.out.println(n + " " + max);
		for(int i = 1; i < len; i ++) {
			n = A[i];	

			subsum = 0;
			for(int j = begin; j <= i; j ++)
				subsum += A[j];	

			if (subsum > max && subsum >= n) {
				max = subsum;
				end = i;
			} else if(n > max && n >= subsum) {
				max = n;
				begin = end = i;
			}
			System.out.println(n + " " + subsum + " " + max + ", " + begin + ":" + end + "(" + A[begin] + ":" + A[end] + ")");
		}

		return max;
	}

	public static void main(String[] args) {
		MaximumSubarray array = new MaximumSubarray();
		//int[] A = {};
		//int[] A = {-3};
		//int[] A = {1,2};
		//int[] A = {0,3,-1};
		int[] A = {3,-2,-3,-3,1,3,0};
		//int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		//A = null;

		System.out.println("max = " + array.maxSubArray(A));	
	}
}
