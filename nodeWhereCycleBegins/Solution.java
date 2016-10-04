/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (!isCircular(head)) {
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        boolean b = true;
        
        while (fast != slow || b) {
            b = false;
            fast = fast.next.next;
            slow = slow.next;
        }
        
        int headToSlow = nodeCount(head, slow);
        int loopCount = nodeCount(slow.next, slow);
        int diff = 0;
        ListNode headTraveller = head;
        ListNode slowNextTraveller = slow.next;
        if (headToSlow > loopCount) {
            diff = headToSlow - loopCount;
            for (int i = 0; i < diff; i++) {
                headTraveller = headTraveller.next;
            }
        } else if (loopCount > headToSlow) {
            diff = loopCount - headToSlow;
            for (int i = 0; i < diff; i++) {
                slowNextTraveller = slowNextTraveller.next;
            }
        }
        while (headTraveller != slowNextTraveller) {
            slowNextTraveller = slowNextTraveller.next;
            headTraveller = headTraveller.next;
        }
        
        return headTraveller;
    }
    
    private static int nodeCount (ListNode startNode, ListNode endNode) {
        int count = 0;
        ListNode temp = startNode;
        while (temp != endNode) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    private boolean isCircular (ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}