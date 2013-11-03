/*
Remove Duplicates from Sorted List Total Accepted: 2761 Total Submissions: 8230 My Submissions
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/
/**
Submission Result: Wrong Answer

 Input:		{1,1,1}
 Output:	{1,1}
 Expected:	{1}
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
		ListNode tmp = head;
		ListNode prev = null;

		while(tmp != null) {
			prev = tmp;
			System.out.println(tmp.val);
			while(tmp != null && prev.val == tmp.val) 
				tmp = tmp.next;	
			prev.next = tmp;
		}
        
		return head;
	}

	public static void print(ListNode head) {
		ListNode tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val);
			if (tmp.next != null)
				System.out.print("->");
			tmp = tmp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();
		ListNode node = new ListNode(1);	
		node.next = new ListNode(1);
		//node.next.next = new ListNode(1);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(3);
		node.next.next.next.next = new ListNode(3);

		//node = null;
		
		print(node);
		list.deleteDuplicates(node);
		print(node);
	}
}
