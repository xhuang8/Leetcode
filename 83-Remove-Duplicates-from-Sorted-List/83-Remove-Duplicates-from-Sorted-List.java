/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode front = head;
        ListNode back = head.next;
        
        while(front != null && back != null){
            if(front.val == back.val){
                front.next = back.next;
                back = back.next;
                continue;
            }
            front = back;
            back = back.next;
        }
        return head;
    }
}