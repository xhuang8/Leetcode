/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*
If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        
        ListNode listA = headA;
        ListNode listB = headB;
        
        while(listA != null && listB != null){
            if(listA == listB){
                return listA;
            }
            
            listA = listA.next;
            listB = listB.next;
            
            if(listA == listB){
                return listA;
            }
            
            if(listA == null){
                listA = headB;
            }
            
            if(listB == null){
                listB = headA;
            }
        }
        return listA;
    }
}