public class RemoveDupLinkedList {
    void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeDuplicates(ListNode head) {
        return reverse(removeDupAcc(head, null, -101), null);
    }

    private ListNode reverse(ListNode head, ListNode acc) {
        if (head == null) return acc;

        ListNode rest = head.next;
        head.next = acc;

        return reverse(rest, head);
    }

    private ListNode removeDupAcc(ListNode head, ListNode acc, int val) {
        if (head == null) return acc;
        if (head.next != null && head.val == (head.next).val) {
            return removeDupAcc(head.next, acc, head.val);
        }
        if (head.val == val) {
            return removeDupAcc(head.next, acc, head.val);
        }
        ListNode rest = head.next;
        head.next = acc;
        return removeDupAcc(rest, head, val);
    }
}
