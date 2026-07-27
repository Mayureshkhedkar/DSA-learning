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

        if(head.next == null){
            return null;
        }

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
        curr = head;
        int i=0;
        while(i<size-n-1){
            curr = curr.next;
            i++;
        }
        curr.next=curr.next.next;
        
        return head;
    }
}