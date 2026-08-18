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

        // Dummy node helps when left = 1
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move prev to the node just before 'left'
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // 'curr' is the first node of the portion to reverse
        ListNode curr = prev.next;

        // Reverse the required portion
        for (int i = 0; i < right - left; i++) {

            // Node that we want to move to the front
            ListNode next = curr.next;

            // Remove 'next' from its current position
            curr.next = next.next;

            // Put 'next' before curr
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}