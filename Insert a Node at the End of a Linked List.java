// java.util.* has been imported for this problem.
// You don't need any other imports.

public ListNode insertAtTail(ListNode head, int data) {
    if(head == null) return head = new ListNode(data);
    ListNode current = head;
    while(current.next != null) {
        current = current.next;
    }
    current.next = new ListNode(data);
    return head;
}