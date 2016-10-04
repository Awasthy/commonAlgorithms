/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> pQueue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            public int compare (ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });
        ListNode temp = null;
        ListNode current = null;
        for (int i = 0; i < lists.length; i++) {
            temp = lists[i];
            while (temp != null) {
                current = temp;
                temp = temp.next;
                current.next = null;
                pQueue.add(current);
            }
        }
        
        ListNode result = new ListNode(0);
        ListNode traveller = result;
        
        while (pQueue.size() != 0) {
            traveller.next = pQueue.poll();
            traveller = traveller.next;
        }
        return result.next;
    }
}