public class RemoveNthList {
    void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode rev = reverse(head, null);
        return reverseWhileRemove(rev, null, (n-1));
    }

    private ListNode reverse(ListNode head, ListNode acc) {
        if (head == null) return acc;

        ListNode rest = head.next;
        head.next = acc;

        return reverse(rest, head);
    }

    private ListNode reverseWhileRemove(ListNode head, ListNode acc, int n) {
        if (head == null) return acc;
        if (n == 0) {
            return reverse(head.next, acc);
        }

        ListNode rest = head.next;
        head.next = acc;
        return reverseWhileRemove(rest, head, (n - 1));
    }
}
