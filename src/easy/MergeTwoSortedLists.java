package easy;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        System.out.println(head);
        System.out.println("Start");

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummy.next = list1;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
            }
            System.out.println(dummy);

            System.out.println("Calling Dummy next");

            dummy = dummy.next;
            System.out.println(dummy);

            System.out.println("NEXT");


        }

        if (list1!=null) {
            dummy.next = list1;
        }

        if (list2!=null) {
            dummy.next = list2;
        }

        System.out.println(head);

        return head.next;


    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
