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
        ArrayList<Integer> list = new ArrayList<>();
        list = mergeAll(listify(head, new ArrayList<>()));
        return arrayListToLinkedList(list);
    }

    public ListNode arrayListToLinkedList(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return null;

        ListNode head = new ListNode(arr.get(0));
        ListNode curr = head;

        for (int i = 1; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }

        return head;
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

    private static ArrayList<Integer> mergeTwo(
            ArrayList<Integer> a,
            ArrayList<Integer> b
    ) {
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

    public static ArrayList<Integer> mergeAll(
            ArrayList<ArrayList<Integer>> lists
    ) {
        if (lists.isEmpty()) return new ArrayList<>();

        while (lists.size() > 1) {
            ArrayList<ArrayList<Integer>> next = new ArrayList<>();

            for (int i = 0; i < lists.size(); i += 2) {
                if (i + 1 < lists.size()) {
                    next.add(mergeTwo(lists.get(i), lists.get(i + 1)));
                } else {
                    next.add(lists.get(i)); // odd one out
                }
            }

            lists = next;
        }

        return lists.get(0);
    }
}
