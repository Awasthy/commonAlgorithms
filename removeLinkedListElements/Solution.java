/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode result = new ListNode(0);
        ListNode tempResult = result;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val != val) {
                tempResult.next = temp;
                tempResult = temp;
                temp = temp.next;
                tempResult.next = null;
            } else {
                temp = temp.next;
            }
        }
        return result.next;
    }
}