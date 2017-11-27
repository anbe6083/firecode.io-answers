/*
Edge cases to take into account here:
    * What if the head node is null?
    * What is n is greater than the length of the list? What if it's negative?
*/
public ListNode findNthNodeFromEnd(ListNode head, int n) {
    if(head == null) return null;
    int count = 0, length = 0, target = 0;
    ListNode current = head;
    while(current != null) {
        count++;
        current = current.next;
    }
    length = count;
    target = length - n;
    current = head;
    count = 0;
    while(current != null && count != target) {
        count++;
        current = current.next;
    }
    if(count == target) return current;
    return null;
}