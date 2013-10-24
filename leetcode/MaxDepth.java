/*
 * Maximum Depth of Binary Tree AC Rate: 2790/6144 My Submissions
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/

/**
 * Definition for binary tree
 *  public class TreeNode {
 *       int val;
 *       TreeNode left;
 *       TreeNode right;
 *       TreeNode(int x) { val = x; }
 *  }
 *  
 */

import java.util.*;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
	if (root == null) return 0;

	LinkedList<TreeNode> q = new LinkedList();
	int maxdepth = 1;

	root.val = 1;
	q.add(root);
	while (!q.isEmpty()) {
		TreeNode node = q.remove();
		System.out.println(node);

		if(node.left != null) {
			node.left.val = node.val + 1;	
			maxdepth = Math.max(maxdepth, node.left.val);
			q.add(node.left);
		} 
		if(node.right != null) {
			node.right.val = node.val + 1;
			maxdepth = Math.max(maxdepth, node.right.val);
			q.add(node.right);	
		}
	}

    	return maxdepth;
    }

	public static void main(String[] args) {
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(2);
		t.right = new TreeNode(3);

		t.left.left = new TreeNode(4);
		t.left.right = new TreeNode(5);

		t.right.left = new TreeNode(6);
		t.right.right = new TreeNode(7);

		t.right.left.right = new TreeNode(8);

		MaxDepth md = new MaxDepth();		
		System.out.println(md.maxDepth(t));
		System.out.println(md.maxDepth(null));
	}	
}

/*
public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
}
*/
