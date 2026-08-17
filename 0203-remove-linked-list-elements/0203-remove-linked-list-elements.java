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
    public ListNode removeElements(ListNode head, int val) {
        /*ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;

        while(curr.next != null) {
            if(curr.next.val == val) {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return dummy.next;*/
        
        // Remove matching nodes from the beginning
        while(head != null && head.val == val) {
            head = head.next;
        }

        // If all nodes were removed
        if(head == null) {
            return null;
        }
        
        // Traverse the remaining list
        ListNode curr = head;
        while(curr.next != null) {
            if(curr.next.val == val) {
                // Skip the node
                curr.next = curr.next.next;
            }
            else {
                // Move forward
                curr = curr.next;
            }
        }
        return head;
    }
}