package LeetCode.linkedlist;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeLinkedlist {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        while (list1 != null || list2 != null) {
            int x = (list1 != null) ? list1.val : Integer.MAX_VALUE;
            int y = (list2 != null) ? list2.val : Integer.MAX_VALUE;

            if (x < y) {
                current.next = new ListNode(x);
                list1 = list1.next;
            } else {
                current.next = new ListNode(y);
                list2 = list2.next;
            }
            current = current.next;
        }

        return dummyHead.next;
    }

    public static ListNode createLinkedListFromInput(String input) {
        String[] values = input.split(" ");
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value));
            current = current.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode list1 = createLinkedListFromInput("1 2 4");
        ListNode list2 = createLinkedListFromInput("1 3 4");
        ListNode result = new MergeLinkedlist().mergeTwoLists(list1, list2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
