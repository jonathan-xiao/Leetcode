public class AddLinkedList {
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addhelp(l1, l2, 0);
    }

    public ListNode addhelp(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        int sum = carry;
        if (l1 != null) sum += l1.val;
        if (l2 != null) sum += l2.val;

        ListNode head = new ListNode(sum % 10);
        ListNode cont1 = new ListNode();
        if (l1 == null) {
            cont1 = null;
        } else {
            cont1 = l1.next;
        }
        ListNode cont2 = new ListNode();
        if (l2 == null) {
            cont2 = null;
        } else {
            cont2 = l2.next;
        }
        head.next = addhelp(cont1, cont2, sum / 10);
        return head;
    }
}
