
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
        //递归
        ListNode result=null;
        if(l1==null || l2==null){
            if(l1==null && l2==null)
                return null;
            else
                return result=(l1==null ? l2 : l1);
        }
        if(l1.val<l2.val){
            result=l1;
            result.next=mergeTwoLists(l1.next, l2);
        }else{
            result=l2;
            result.next=mergeTwoLists(l1, l2.next);
        }
        return result;
    }
}
