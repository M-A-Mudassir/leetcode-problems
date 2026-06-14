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
    public ListNode rev(ListNode head){
        if(head == null || head.next == null)return head;
        ListNode nHead = rev(head.next);
        head.next.next = head;
        head.next = null;
        return nHead;
    }
    public int pairSum(ListNode head) {
        if(head == null || head.next == null)return 0;
        ListNode t1 = head.next;
        ListNode t2  = new ListNode(head.val);
        ListNode head2 = t2;
        while(t1 != null){
            ListNode t3 = new ListNode(t1.val);
            t2.next = t3;
            t2 = t2.next;
            t1 = t1.next;
        }
        ListNode r2 = rev(head2);
        t1 = head;        
        int res = Integer.MIN_VALUE;
        while(t1 != null){
            res = Math.max(res,t1.val+r2.val);
            t1 = t1.next;
            r2 = r2.next;
        }
        return res;
    }
}