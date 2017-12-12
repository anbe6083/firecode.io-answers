// java.util.* has been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
    if(head == null) return null;
    if(head.next == head) return null;
    ListNode slow = null, fast = head;
    while( fast.next != head ) {
        slow = fast;
        fast = fast.next;
    }
    slow.next = fast.next;
    return head;
}