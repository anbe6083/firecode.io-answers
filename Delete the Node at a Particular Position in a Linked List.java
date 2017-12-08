// java.util.* has been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtMiddle(ListNode head, int position) {
    if(head == null || position < 1) return head;
    if(position == 1) return head.next;
    ListNode current = head, previous = null;
    int count = 1;
    while(current != null && count != position) {
        count++;
        previous = current;
        current = current.next;
    }
    if(count == position) {
        previous.next = current.next;
    }
    return head;
}