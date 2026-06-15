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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i=0;i<left-1;i++){
            pre = pre.next;
        }
        ListNode curr = pre.next;
        for(int i=0;i<(right-left);i++){
            ListNode fr = curr.next;
            curr.next = fr.next;
            fr.next = pre.next;
            pre.next = fr;
        }
        return dummy.next;
    }
}