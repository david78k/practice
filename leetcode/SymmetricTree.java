/*
Symmetric Tree Total Accepted: 2732 Total Submissions: 8185 My Submissions
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.

confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.


OJ's Binary Tree Serialization:
The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

Here's an example:
   1
  / \
 2   3
    /
   4
    \
     5
The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
*/

/**
 *  Definition for binary tree
 *  public class TreeNode {
 *       int val;
 *       TreeNode left;
 *       TreeNode right;
 *       TreeNode(int x) { val = x; }
 *  }
 */

import java.util.*;

public class SymmetricTree {
	private boolean help(TreeNode left, TreeNode right) {
		if(left == null && right == null) return true;
		if(left == null || right == null) return false;
		if(left.val != right.val) return false;
		return help (left.left, right.right) && help (left.right, right.left);	
	}

    public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;

		return help(root.left, root.right);
	}

    public boolean isSymmetricOneQueue(TreeNode root) {
		if(root == null) return true;

		TreeNode l, r;
		LinkedList<TreeNode> q = new LinkedList<TreeNode>();
		
		q.addLast(root.left);
		q.addLast(root.right);
	
		while(q.size() > 0) {
			l = q.removeFirst();
			r = q.removeFirst();						
			if(l == null && r == null) continue;
			if(l == null || r == null || l.val != r.val) return false;
			
			System.out.println(l.val + " " + r.val);

			q.addLast(l.left);
			q.addLast(r.right);
			q.addLast(l.right);
			q.addLast(r.left);
		}

		System.out.println("done");

		return true;
	}

    public boolean isSymmetricTwoQueues(TreeNode root) {
		if(root == null) return true;	

		TreeNode left = root.left;
		TreeNode right = root.right;
		TreeNode ltop, rtop;

		LinkedList<TreeNode> leftQ = new LinkedList<TreeNode>();
		LinkedList<TreeNode> rightQ = new LinkedList<TreeNode>();

		leftQ.addLast(left);
		rightQ.addLast(right);

		while(leftQ.size() > 0) {
			//if(rightQ.size() == 0) return false;
			ltop = leftQ.removeFirst();
			rtop = rightQ.removeFirst();
				
			System.out.println(ltop + " " + rtop);

			//if(ltop != rtop) return false;
			if(ltop == null && rtop != null) return false;
			if(ltop != null && rtop == null) return false;
			if(ltop == null && rtop == null) continue;
			if(ltop.val != rtop.val) return false;

			if(ltop != null) {
				leftQ.addLast(ltop.left);
				leftQ.addLast(ltop.right);
			}
			if(rtop != null) {
				rightQ.addLast(rtop.right);
				rightQ.addLast(rtop.left);
			}
		}

		System.out.println("done");

		if(rightQ.size() > 0) return false;

		return true;
	}

	public static void main(String[] args) {
		SymmetricTree st = new SymmetricTree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);

		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);

		//root = null;
//		root.left = null;
//		root.right = null;

		System.out.println(st.isSymmetric(root));
	}	
}
