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
        ListNode curr1 = head;
        ListNode curr2 = head;
        if (head == null)
            return null;
        while (curr2 != null && curr2.next != null) {
            curr1 = curr1.next;
            curr2 = curr2.next.next;

            if (curr1 == curr2) {
                curr1 = head;
                while (curr1 != curr2) {
                    curr1 = curr1.next;
                    curr2 = curr2.next;
                }
                return curr1;
            }
        }
        
        return null;
    }
}