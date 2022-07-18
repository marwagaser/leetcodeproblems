/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap <ListNode, Boolean> track= new HashMap <ListNode,Boolean>();
        ListNode current = head;
        
        while(current!=null){
        if (track.containsKey(current) == false){
            track.put(current,true);
            current = current.next;
        }
            else{
                return true;
            }
        }
        return false;
        
        
        
        
    }
}
