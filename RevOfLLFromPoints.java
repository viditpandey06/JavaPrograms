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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode start_prev = new ListNode();
        start_prev = null;
        ListNode start = new ListNode();
        start = null;
        ListNode end_next = new ListNode();
        end_next = null;
        ListNode end = new ListNode();
        end = null;
        ListNode cur = new ListNode();
        cur = head;
        int i = 1;
        while (cur != null) {
            if (i < left) {
                start_prev = cur;
            }
            if (i == left) {
                start = cur;
            }
            if (i == right) {
                end = cur;
            }
            cur = cur.next;
            i++;
        }
        if (end.next != null)
            end_next = end.next;
        end.next = null;
        end = reverse(start);

        cur = head;
        if (start_prev == null) {
            head = end;
            start.next = end_next;
        } else if (start_prev != null) {
            start_prev.next = end;
            start.next = end_next;
        }
        return head;
    }

    ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}