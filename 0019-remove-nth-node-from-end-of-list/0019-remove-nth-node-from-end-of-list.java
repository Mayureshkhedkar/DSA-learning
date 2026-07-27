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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode dummy = new ListNode(0, head);
        ListNode dummy=head;
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        if (size == n) {
            return head.next;
        }
        System.out.println(size);
        curr = dummy;
        for (int i = 0; i < size - n -1; i++) {
            curr = curr.next;
        }
        curr.next=curr.next.next;
        
        return head;
    }
}