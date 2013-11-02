/*
Remove Duplicates from Sorted List Total Accepted: 2761 Total Submissions: 8230 My Submissions
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
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
        
		return head;
	}

	public static void print(ListNode head) {
		ListNode tmp = head;
		while(tmp != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();
		ListNode node = new ListNode(0);	
		node.next = new ListNode(1);
		
		list.deleteDuplicates(node);
		print(node);
	}
}
