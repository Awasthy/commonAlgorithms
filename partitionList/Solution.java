/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode xGreater = null;
        ListNode greaterTail = null;
        ListNode xLesser = null;
        ListNode lesserTail = null;
        ListNode temp = head;
        
        while (temp != null) {
            if (temp.val < x) {
                ListNode node = temp;
                temp = temp.next;
                node.next = null;
                if (xLesser == null) {
                    xLesser = node;
                    lesserTail = node;
                } else {
                    lesserTail.next = node;
                    lesserTail = node;
                }
            } else {
                ListNode node = temp;
                temp = temp.next;
                node.next = null;
                if (xGreater == null) {
                    xGreater = node;
                    greaterTail = node;
                } else {
                    greaterTail.next = node;
                    greaterTail = node;
                }
            }
        }
        
        if (lesserTail != null) {
            lesserTail.next = xGreater;
        } else return xGreater;
        
        return xLesser;
    }
}