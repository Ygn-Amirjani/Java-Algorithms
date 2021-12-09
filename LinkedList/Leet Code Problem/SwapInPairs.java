/** Question link ->  https://leetcode.com/problems/swap-nodes-in-pairs/ */

public class SwapInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null ;

        ListNode fast = head.next ;
        ListNode slow = head ;
        int tmp ;
        
        while (fast != null) {
            tmp = fast.val ;
            fast.val = slow.val ;
            slow.val = tmp ;
            
            slow = slow.next.next ;
            fast = fast.next ;
            if(fast != null) fast = fast.next ;
        }

        return head ;
    }
    
}
