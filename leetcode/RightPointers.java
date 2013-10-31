/*
Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
For example,
Given the following perfect binary tree,
         1
       /  \
      2    3
     / \  / \
    4  5  6  7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
*/

/**
 *  * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class RightPointers {
    public void connect(TreeLinkNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case. 
	if(root == null) return;

	System.out.println(root.val + " -> " + ((root.next != null)?root.next.val:"null"));	
	if (root.left != null) 
		root.left.next = root.right;

	if(root.right != null) 
		root.right.next = (root.next !=null)?root.next.left:null;

	connect(root.left);

	connect(root.right);
  }

/*
	Input:	  {-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13}
	Output:	  {-1,#,0,1,#,2,3,4,5,#,6,7,8,9,#}
	Expected: {-1,#,0,1,#,2,3,4,5,#,6,7,8,9,10,11,12,13,#}
*/
	public static void main (String[] args) {
		TreeLinkNode tree = new TreeLinkNode(1);
		tree.left = new TreeLinkNode(2);
		tree.right = new TreeLinkNode(3);
		tree.left.left = new TreeLinkNode(4);
		tree.left.right = new TreeLinkNode(5);
		tree.right.left = new TreeLinkNode(6);
		tree.right.right = new TreeLinkNode(7);
		
		// check null tree
		//tree = null;
		// check single node tree
		//tree = new TreeLinkNode(1);

		RightPointers rp = new RightPointers();
		rp.connect(tree);	
	}
}
