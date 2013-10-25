/*
 * Given two binary trees, write a function to check if they are equal or not.
 *
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */

/**
 *  Definition for binary tree
 *   public class TreeNode {
 *       int val;
 *       TreeNode left;
 *       TreeNode right;
 *       TreeNode(int x) { val = x; }
 *  }
 *         */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
		System.out.println(p + " == " + q);

		if( p == null && q !=null) return false;
		if( p != null && q == null) return false;
		if (p == null && q == null) return true;
				
		if (p.val != q.val) return false;

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

//		TreeNode ptmp = p;
//		TreeNode qtmp = q;

		//while(ptmp != null && ptmp == qtmp) {
		/*
		while(ptmp != null) {
			System.out.println(ptmp + " == " + qtmp);
			if (qtmp == null || ptmp.val != qtmp.val) return false;
			//if(p.val != q.val) return false;

			ptmp = ptmp.left;
			qtmp = qtmp.left;
		}

		if (qtmp != null ) return false;
		//if(p.left != null || p.right != null) return false;
		return true;
		*/
	}

	public void buildTree(TreeNode t, int from, int to) {
		for (int i = from; i <= to; i ++) {
				
		}	
	}

	public static void main(String[] args) {
		SameTree st = new SameTree();
		TreeNode p = new TreeNode(1);
		TreeNode q = new TreeNode(1);
		//q = new TreeNode(100);

		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		p.left.left = new TreeNode(4);

		q.left = new TreeNode(2);
		q.right = new TreeNode(3);
		q.left.left = new TreeNode(4);
		//q.left.left = new TreeNode(5);
		//q.left.right = new TreeNode(6);

		//p = null;
		//q = null;
		System.out.println(st.isSameTree(p, q));
	}
}
