import java.util.ArrayList;

public class RotateRight {
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (head == null) return head;
        if (k == 0) return head;
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        k %= list.size();
        for (int i = 0; i < list.size() - k; i++) {
            list.add(list.remove(0));
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int x : list) {
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return dummy.next;
    }
}
