public class Partition {
    public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode frontDummy = new ListNode(0);
        ListNode front = frontDummy;
        ListNode tailDummy = new ListNode(0);
        ListNode tail = tailDummy;
        while (head != null) {
            if (head.val < x) {
                front.next = head;
                front = front.next;
            } else {
                tail.next = head;
                tail = tail.next;
            }
            head = head.next;
        }

        tail.next = null;
        front.next = tailDummy.next;

        return frontDummy.next;
    }

}
