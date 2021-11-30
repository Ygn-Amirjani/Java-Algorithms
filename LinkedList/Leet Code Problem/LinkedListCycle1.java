/** Question link ->  https://leetcode.com/problems/linked-list-cycle/ */

public class LinkedListCycle1 {

    public boolean hasCycle(ListNode head) {
        ListNode counter = head ;
        while( counter != null ) {
            /** Constraints :
             *  -10^5 <= Node.val <= 10^5
            */
            if(counter.val > 100000)
                return true ;

            counter.val = 100001 ;
            counter = counter.next ;
        }

        return false ;

    }
    
}

