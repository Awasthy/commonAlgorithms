/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode outer = head;
        while (outer != null) {
            if (outer.next != null) {
                ListNode inner = outer;
                while (inner != null) {
                    if (inner.val == outer.val) {
                        inner = inner.next;
                    } else {
                        break;
                    }
                }
                outer.next = inner;
            }
            outer = outer.next;
        }
        return head;
    }
}