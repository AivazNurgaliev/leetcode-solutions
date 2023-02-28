package medium;

import util.ListNode;

public class task_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode leftPtr = dummyNode;
        ListNode rightPtr = head;

        while (n-- > 0 && rightPtr != null) {
            rightPtr = rightPtr.next;
        }

        while (rightPtr != null) {
            leftPtr = leftPtr.next;
            rightPtr = rightPtr.next;
        }

        leftPtr.next = leftPtr.next.next;

        return dummyNode.next;
    }
}


