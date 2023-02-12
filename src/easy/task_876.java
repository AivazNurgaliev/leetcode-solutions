package easy;

import util.ListNode;

public class task_876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    /*public ListNode middleNode(ListNode head) {
        int lenCounter = 0;
        ListNode cur = head;
        while(cur.next != null) {
            cur = cur.next;
            lenCounter++;
        }

        ListNode res = head;
        for (int i = 0; i < (lenCounter + 1) / 2; i++) {
            res = res.next;
        }

        return res;
    }*/
}
