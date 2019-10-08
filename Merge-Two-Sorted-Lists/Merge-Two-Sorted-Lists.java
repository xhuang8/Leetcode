/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(-1);
        ListNode t3 = l3;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                t3.next = l1;
                l1 = l1.next;
            }else{
                t3.next = l2;
                l2 = l2.next;
            }
            t3 = t3.next;
        }
        if(l1 != null){
            t3.next = l1;
        }
        else{
            t3.next = l2;
        }
        return l3.next;
    }
}