import java.util.ArrayList;

public class SortList {
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode sortList(ListNode head) {

    }

    public ArrayList<Integer> merges(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> res = new ArrayList<>(a.size() + b.size());
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                res.add(a.get(i++));
            } else {
                res.add(b.get(j++));
            }
        }

        while (i < a.size()) res.add(a.get(i++));
        while (j < b.size()) res.add(b.get(j++));

        return res;
    }

    public ArrayList<ArrayList<Integer>> listify(ListNode head, ArrayList<ArrayList<Integer>> acc) {
        if (head == null) return acc;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(head.val);
        acc.add(temp);
        return listify(head.next, acc);
    }

    public ArrayList<ArrayList<Integer>> sorthelp1(ArrayList<ArrayList<Integer>> lst, ArrayList<ArrayList<Integer>> acc) {
        if (lst == null) return acc;
        if (lst.size() == 1) {
            acc.add(lst.get(0));
            return acc;
        }
        acc.add(mergeTwoLists(lst.get(0), lst.get(1)));
    }

}
