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
    
    public int getLength(ListNode head){
        int sum =0;
        ListNode current = head;
        while (current!=null){
            sum+=1;
            current = current.next;
        }
        return sum;
        
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
      int len = getLength(head);
        ListNode current = head.next;
        ListNode previous = head;
        int currentIndex=0;
        if (n ==len) {
             head = current;
            return head;
        }
        
        
        while((len-n)-1 != currentIndex ){
            currentIndex++;
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        return head;
    }
}
