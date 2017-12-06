// java.util.* has been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtHead(ListNode head) {
    if(head == null || head.next == null) return null;
    return head.next;
}