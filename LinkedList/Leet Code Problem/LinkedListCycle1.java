/** Question link ->  https://leetcode.com/problems/linked-list-cycle/ */

public class LinkedListCycle1 {

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

