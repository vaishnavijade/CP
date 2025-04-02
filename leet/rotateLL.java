package leet;

 */
class rotateLL {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k = k % len;
        if (k == 0) {
            return head;
        }

        ListNode newTail = head;
        for (int i = 1; i < len - k; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}/*head =
[1,2,3,4,5]
k =
2
Output
[4,5,1,2,3]
Expected
[4,5,1,2,3] */
