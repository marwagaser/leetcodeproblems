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
 /*
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode dummy = new ListNode(0) ;
        ListNode tail = dummy;

        while(head2!=null && head1 != null){
           if (head1.val < head2.val){
              tail.next = head1;
           
              head1 = head1.next;
            }
            else{
               tail.next = head2;              
              head2 = head2.next;
               
                
            }
            tail = tail.next;
        }
       if (head2==null && head1!=null){
            tail.next = head1;
        }
        else if (head2!=null && head1==null){
              tail.next = head2;
        }
       return dummy.next;
        }
    }
*/
 
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode mergedHead = new ListNode();
        ListNode solidPointer = mergedHead;
        if (head1 == null && head2 == null){
            return null;
        }
        else if (head1 == null && head2 != null)
                return head2;          
        else if (head2 == null && head1 != null)
                return head1;
            
         else if (head1.val < head2.val){
             mergedHead.val = head1.val;  
             head1 = head1.next;
         }
                          
         else{
             mergedHead.val = head2.val;
             head2= head2.next;
         }
                      
        while(head2!=null && head1 != null){
           if (head1.val < head2.val){
              mergedHead.next= new ListNode(head1.val);
               mergedHead = mergedHead.next;
              head1 = head1.next;
            }
            else{ 
                mergedHead.next = new ListNode(head2.val);
                mergedHead =mergedHead.next;
                head2 = head2.next;
            }
        }
        if (head2==null && head1!=null){
            mergedHead.next = head1;
        }
        else if (head2!=null && head1==null){
            mergedHead.next = head2;
        }
       return solidPointer;
        }
    }

