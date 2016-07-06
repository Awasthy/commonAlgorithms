//Adding 2 numbers
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        int num1 = 0, num2 = 0;
        ListNode head = null, tail = null;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                num1 = l1.val;
            }
            if (l2 != null) {
                num2 = l2.val;
            }
            int sum = num1 + num2 + carry;
            carry = 0;
            num1 = 0;
            num2 = 0;
            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            }
            ListNode l = new ListNode(sum);
            if (head == null) {
                head = l;
                tail = l;
            } else {
                tail.next = l;
                tail = tail.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return head;
    }
}