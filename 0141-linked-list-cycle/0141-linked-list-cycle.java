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
    public boolean hasCycle(ListNode head) {
        ListNode curr1 = head;
        ListNode curr2 = head;
        if(head == null ) return false;
        // if (curr1 == null)
        //     return false;
        // if (curr1.next == null)
        //     return false;

        while (curr2 != null && curr2.next != null) {
            curr1 = curr1.next;
            curr2 = curr2.next.next;

            if (curr1 == curr2) {
                return true;
            }
        }
        return false;
    }
}