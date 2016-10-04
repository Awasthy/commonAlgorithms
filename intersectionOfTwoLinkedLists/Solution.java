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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aCount = count(headA);
        int bCount = count(headB);
        
        ListNode aTraveller = headA;
        ListNode bTraveller = headB;
        
        if (aCount > bCount) {
            for (int i = 0; i < aCount - bCount; i++) {
                aTraveller = aTraveller.next;
            }
        } else {
            for (int i = 0; i < bCount - aCount; i++) {
                bTraveller = bTraveller.next;
            }
        }
        
        while (aTraveller != bTraveller) {
            aTraveller = aTraveller.next;
            bTraveller = bTraveller.next;
        }
        
        return aTraveller;
    }
    
    private int count (ListNode list) {
        int count = 0;
        ListNode l = list;
        while (l != null) {
            count++;
            l = l.next;
        }
        return count;
    }
}