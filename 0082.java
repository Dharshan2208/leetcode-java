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
import java.util.HashMap;
import java.util.Map;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        Map<Integer, Integer> freq = new HashMap<>();
        ListNode curr = head;
        while (curr != null) {
            // it will get the value if it exist then +1 or else 0 as default
            freq.put(curr.val, freq.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode anotherCurr = dummy;
        curr = head;

    // getiing the values from hashmap and making for single ones
        while (curr != null) {
            if (freq.get(curr.val) == 1) {
                anotherCurr.next = new ListNode(curr.val);
                anotherCurr = anotherCurr.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}


// did using hashmap will think how to do using 0(1) i have the idea of using two pointers and
// doing but have to think it properly