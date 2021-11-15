/** Question link -> https://leetcode.com/problems/linked-list-cycle-ii/ */

class List_Node {
    // Definition for singly-linked list.
    int val;
    List_Node next;

    List_Node(int x) {
        val = x;
        next = null;
    }

}

public class LinkedListCycle2 {
    public List_Node detectCycle(List_Node head) {
        List_Node counter = head ;
        while( counter != null ) {
            if(counter.val == 100001)
                return counter ;

            counter.val = 100001 ;
            counter = counter.next ;
        }

        return null ;
    }
}

