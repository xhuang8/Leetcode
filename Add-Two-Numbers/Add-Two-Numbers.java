/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l3 = new ListNode(-1);
        ListNode t3 = l3;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            if(l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }
        
            t3.next = new ListNode(carry % 10);
            carry /= 10;
            t3 = t3.next;
        }
        if (carry == 1){
            t3.next = new ListNode(1);
        }
        return l3.next;
    }
}