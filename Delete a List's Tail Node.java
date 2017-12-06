/*
Edge cases: head can be null or there can be only 1 node in the list
Description: Uses 2 pointser, fast and slow. fast is used to find the tail node in the list and slow to find the 2nd to last. Once you find the tail node, change the pointer for slow.next to point to null
*/

public ListNode deleteAtTail(ListNode head) {
    if(head == null || head.next == null) return null;
    ListNode slow = head, fast = head.next;
    while(fast.next != null) {
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    return head;
}