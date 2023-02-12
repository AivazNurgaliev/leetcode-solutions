package easy;

public class task_876 {
    public ListNode middleNode(ListNode head) {
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
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}