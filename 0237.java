/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // basically its not deleting but kind of deleting only
        node.val = node.next.val;
        node.next = node.next.next;
    }
}