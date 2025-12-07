import java.util.HashSet;

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

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        HashSet<ListNode> set = new HashSet<>();
        while (p1 != null) {
            set.add(p1);
            p1 = p1.next;
        }
        while (p2 != null) {
            if (set.contains(p2)) {
                return p2;
            }
            p2 = p2.next;
        }
        return null;
    }
}
