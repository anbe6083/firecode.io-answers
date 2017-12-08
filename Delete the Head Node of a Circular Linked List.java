// java.util.* has been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtHead(ListNode head) {
    if(head == null) return null;
    ListNode current = head;
    if(current.next == current) return null;
    while(current.next != head) {
        current = current.next;
    }
    current.next = current.next.next;
    return head = current.next;
}