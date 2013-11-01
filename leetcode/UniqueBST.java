/*
Unique Binary Search Trees Total Accepted: 2233 Total Submissions: 6642 My Submissions
Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
*/

public class UniqueBST {
    public int numTrees(int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
	if (n <= 1) return 1;
	
	int sum = 0;
	int left = 0; 
	int right = 0;

	for (int i = 1; i <= n; i ++) {
		left = numTrees(i - 1);
		right = numTrees(n - i);
		sum += left * right;
	}
		
	return sum;
    }

	public int numTreesCatalan(int n) {
		int c = 1;
	
		for (int i = 2; i <= n; i ++) 
			c = 2 * (2*i - 1)*c / (i + 1);
	
		return c;
	}

	public static void main(String[] args) {
		UniqueBST bst = new UniqueBST();
		int n = 3;
		n = 0;
	//	n = 1;
	//	n = 5;
		n = 4;
		System.out.println(bst.numTrees(n));
	}
}
