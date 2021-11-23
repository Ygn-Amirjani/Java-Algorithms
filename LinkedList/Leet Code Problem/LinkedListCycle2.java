/** Question link -> https://leetcode.com/problems/linked-list-cycle-ii/ */

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode counter = head ;
        while( counter != null ) {
            if(counter.val == 100001)
                return counter ;

            counter.val = 100001 ;
            counter = counter.next ;
        }

        return null ;
    }
}

