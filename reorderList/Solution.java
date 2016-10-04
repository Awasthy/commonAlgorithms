/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode arr [] = new ListNode [2];
        arr = splitIn2(head);
        arr[1] = reverse(arr[1]);
        
        head = merge(arr[0], arr[1]);
    }
    
    private ListNode merge (ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode traveller = result;
        boolean flag = true;
        while (l1 != null || l2 != null) {
            ListNode temp = null;
            if (flag) {
                temp = l1;
                l1 = l1.next;
            } else {
                temp = l2;
                l2 = l2.next;
            }
            temp.next = null;
            traveller.next = temp;
            traveller = temp;
            flag = !flag;
        }
        return result.next;
    }
    
    private ListNode reverse (ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode current = node;
        ListNode next = null;
        ListNode prev = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    
    private ListNode [] splitIn2 (ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode slowFollow = head;
        
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            slowFollow = slow;
            slow = slow.next;
        }
        ListNode result [] = new ListNode [2];
        result[0] = head;
        result[1] = slowFollow.next;
        slowFollow.next = null;
        return result;
    }
}