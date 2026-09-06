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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int car=0;
        while( l1!=null || l2!=null || car!= 0){
            int val1=0;
            int val2=0;
            if (l1 != null){
                val1=l1.val;
                l1=l1.next;
            }
            if (l2 != null){
                val2=l2.val;
                l2=l2.next;
            }
            int sum =val1+val2+car;
            car=sum /10; //get the digit otherr than the unit place
            sum=sum%10; //only the last digit reamains after the modulus
            curr.next=new ListNode(sum);
            curr=curr.next;
        }
        return dummy.next;
    }
}