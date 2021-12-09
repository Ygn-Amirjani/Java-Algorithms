/** Question link ->  https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/ */

public class DeleteTheMiddleNode {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || size(head) == 1) return null ;

        ListNode result = head ;
        int count = Math.floorDiv(size(head), 2);

        for(int i=0; i<count-1; i+=1)
            result = result.next ;

        result.next = result.next.next ;
        return head ;
    }

    public int size(ListNode head) {
        ListNode tmp = head ;
        int counter = 0 ;

        while (tmp != null) {
            tmp = tmp.next ;
            counter += 1 ;
        }

        return counter ;
    }

}
