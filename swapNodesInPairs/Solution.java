/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        int temp;
        ListNode temp1, temp2;
        temp1 = head;
        temp2 = temp1.next;
        
        while (true) {
            temp = temp1.val;
            temp1.val = temp2.val;
            temp2.val = temp;
            
            if (temp1.next.next != null) {
                temp1 = temp1.next.next;
            } else {
                return head;
            }
            
            if (temp2.next.next != null) {
                temp2 = temp2.next.next;
            } else {
                return head;
            }

        }
        
    }
}