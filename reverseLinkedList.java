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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null ){
            return head;
        }
        // else if (head.next != null && head.next.next == null){
        //     ListNode temp = head;
        //     head = head.next;
        //     head.next = temp;
        //     temp.next = null;
        //     return head;
        // }
    ListNode prev = null;
    ListNode curr = head;
    ListNode next = curr.next;

        while (curr.next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        return curr;
    }
}
