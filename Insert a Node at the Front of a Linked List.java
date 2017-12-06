// java.util.* has been imported for this problem.
// You don't need any other imports.

public ListNode insertAtHead(ListNode head, int data) {
    if(head == null) return head = new ListNode(data);
    ListNode oldHead = head;
    ListNode newHead = new ListNode(data);
    newHead.next = oldHead;
    return newHead;
            


}