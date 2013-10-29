/*
Linked List Cycle Total Accepted: 65 Total Submissions: 184 My Submissions
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
*/
/**
 *   Definition for singly-linked list.
 *   class ListNode {
 *        int val;
 *        ListNode next;
 *        ListNode(int x) {
 *            val = x;
 *            next = null;
 *        }
 *    }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
	ListNode slow = head, fast = head;
	while(slow != null && fast != null && fast.next != null){
		slow = slow.next;
		fast = fast.next.next;
		//System.out.println(slow.val + " " + fast.val);
		if (slow == fast) return true;
	}	
	return false;	
    }

    public boolean hasCycle2(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
	
	ListNode tmp = head;
	ListNode prev = head;
	while(tmp != null) {
		System.out.println(tmp.val);
		prev = tmp;
		tmp = tmp.next;		
		prev = null;	
	}

	return false;        
     }

	//Last executed input:	{-1,-7,7,-4,19,6,-9,-5,-2,-5}, tail connects to node index 9
	public static void main(String[] args) {
		LinkedListCycle llc = new LinkedListCycle();
		ListNode list = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);

		list.next = second;
		list.next.next = third;
		list.next.next.next = fourth;

		// make a cycle
		fourth.next = third;
		//fourth.next = second;
		
		// check a null list
		//list = null;

		System.out.println(llc.hasCycle(list));
	}
}
