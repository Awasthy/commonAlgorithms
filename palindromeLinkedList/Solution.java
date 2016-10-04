/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode twoHalves [] = new ListNode[2];
        twoHalves = splitIn2(head);
        twoHalves[1] = reverse(twoHalves[1]);
        
        while (twoHalves[1] != null) {
            if (twoHalves[0].val != twoHalves[1].val) {
                return false;
            }
            twoHalves[0] = twoHalves[0].next;
            twoHalves[1] = twoHalves[1].next;
        }
        return true;
    }
    
    private ListNode reverse (ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode current = node;
        ListNode prevNode = null;
        ListNode nextNode = null;
        
        while (current != null) {
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        node = prevNode;
        return node;
    }
    
    private ListNode [] splitIn2 (ListNode node) {
        ListNode fast = node;
		ListNode slow = node;
		ListNode slowFollow = null;
 
		while (fast != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
			}
			slowFollow = slow;
			slow = slow.next;
		}
		ListNode second = slowFollow.next;
		slowFollow.next = null;
		ListNode result [] = {node, second};
		return result;
    }
}