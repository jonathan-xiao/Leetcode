public class IntersectionLinkedLists {
    void main(String[] args) {

    }

    public class ListNode {
         int val;
          ListNode next;
          ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode org = headB;
        while (headA != null) {
            while (headB != null) {
                ListNode b = org;
                if (headA == b) {
                    return headA;
                }
                b =  b.next;
            }
            headA = headA.next;
        }
        return null;
    }
}
