/** Question link -> https://leetcode.com/problems/swapping-nodes-in-a-linked-list/ */

public class SwappingNodes {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return null ;
        
        ListNode fast = head ;
        ListNode slow = head ;
        ListNode start = head ;
        int tmp ;

        while (k > 1) {
            fast = fast.next ;
            k -= 1 ;
        }

        start = fast ;

        while (fast.next != null) {
            fast = fast.next ;
            slow = slow.next ;
        }

        tmp = start.val ;
        start.val = slow.val ;
        slow.val = tmp ;

        return head ;
        
    }


}
