/** Question link ->  https://leetcode.com/problems/linked-list-cycle/ */

class ListNode {
    // Definition for singly-linked list.
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

}

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode counter = head ;
        while( counter != null ) {
            /** Constraints :
             *  -105 <= Node.val <= 105
            */
            if(counter.val > 100000)
                return true ;

            counter.val = 100001 ;
            counter = counter.next ;
        }

        return false ;

    }
    
}

