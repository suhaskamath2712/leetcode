/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k)
    {
        int numNodes = 0;
        ListNode curr = head;

        if (head == null || head.next == null)
            return head;

        while (curr != null)
        {
            numNodes++;
            curr = curr.next;
        }
        
        k = k%numNodes;

        for (int i = 0; i < k; i++)
        {
            ListNode prev;
            curr = head;

            while (curr.next.next != null)
                curr = curr.next;
            
            prev = curr;
            curr = curr.next;

            ListNode temp = curr;
            curr.next = head;
            head = temp;
            prev.next = null;
        }
        return head;
    }
}