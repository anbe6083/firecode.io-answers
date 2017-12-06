/*
	Edge cases: head is null or head only has one node. 

	This solution uses a two pointer technique, fast and slow. Iterate through the linked list. If fast equals 
	null, that means it is an even sized linked list, so the node is smack dab in the middle. Otherwise, 
	its an odd sized list.
*/
public ListNode findMiddleNode(ListNode head) {
    if(head == null) return null;
    if(head.next == null) return head;
    ListNode slow = head, fast = head.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    } 
    
    return slow;
}