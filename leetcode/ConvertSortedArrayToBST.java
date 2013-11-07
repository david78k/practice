/*
Convert Sorted Array to Binary Search Tree Total Accepted: 2525 Total Submissions: 7757 My Submissions
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
*/

public class ConvertSortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] num) {
		return help(num, 0, num.length - 1);
	}
	
	private TreeNode help(int[] num, int begin, int end) {
		if(begin > end) return null;
		if(num == null) return null;
		if(num.length == 0) return null;

		int mid = begin + (end - begin)/2;

		TreeNode tree = new TreeNode(num[mid]);
		tree.left = help(num, begin, mid - 1);
		tree.right = help(num, mid + 1, end);

		return tree;
	}
	
	public static void print(TreeNode node) {
		if(node == null) return;
		System.out.println(node.val + " ");
		print(node.left);
		print(node.right);
	}

	public static void main(String[] args) {
		ConvertSortedArrayToBST converter = new ConvertSortedArrayToBST();
		//int[] num = {};
		//int[] num = {1,2,3,4,5};
		int[] num = {2,4,5,9,13,34};
	
		print(converter.sortedArrayToBST(num));
	}
}
