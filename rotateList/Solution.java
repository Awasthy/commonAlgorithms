/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int num = numberOfNodes(head);
        if (num == 0 || k == 0) {
            return head;
        }
        k = k % num;
        tailPointToHead(head);
        return moveHeadByNumMinusK(head, (num - (k + 1)));
    }
    
    private ListNode moveHeadByNumMinusK(ListNode head, int p) {
        ListNode temp = head;
        while (p > 0) {
            p--;
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
    
    private void tailPointToHead(ListNode head) {
        ListNode node = head;
        if (node.next == null) {
            node.next = head;
            return;
        }
        while (node.next != null) {
            node = node.next;
        }
        node.next = head;
    }
    
    private int numberOfNodes(ListNode head) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            count++;
        }
        return count;
    }
}