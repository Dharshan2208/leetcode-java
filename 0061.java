/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode curr = head;
        int length = 1;

        // trying something
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        // trying to make circular
        curr.next = head;

        k = k % length;
        int newlen = length - k;

        curr = head;
        for (int i = 1; i < newlen; i++) {
            curr = curr.next;
        }

        ListNode newhead = curr.next;
        curr.next = null;

        return newhead;
    }
}