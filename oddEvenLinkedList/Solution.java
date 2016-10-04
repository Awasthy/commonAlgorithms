/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        boolean isEven = true;
        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);
        
        ListNode temp = head;
        ListNode odd = oddHead;
        ListNode even = evenHead;
        while (temp != null) {
            if (isEven) {
                even.next = temp;
                even = temp;
                temp = temp.next;
                even.next = null;
            } else {
                odd.next = temp;
                odd = temp;
                temp = temp.next;
                odd.next = null;
            }
            isEven = !isEven;
        }
        even.next = oddHead.next;
        return evenHead.next;
    }
}