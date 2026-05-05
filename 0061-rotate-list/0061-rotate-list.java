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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        int n = 1;
        ListNode temp = head;
        while(temp.next != null){
            n++;
            temp = temp.next;
        }
        k = k % n;
        if(k == 0){
            return head;
        }
        temp = head;
        ListNode prev = null;
        for(int i=1;i<=n-k;i++){
            prev = temp;
            temp = temp.next;
        }
        if(prev != null)
        prev.next = null;
        ListNode newHead = temp;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return newHead;
    }
}