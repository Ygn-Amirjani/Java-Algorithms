/** Question link ->  https://leetcode.com/problems/remove-duplicates-from-sorted-list/ */

class ListNode {
    // Definition for singly-linked list.
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) { 
        this.val = val; 
    }

    ListNode(int val, ListNode next) {
         this.val = val; this.next = next; 
    }
}

public class RemoveDuplicatesLinkedList1 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null ;
        
        ListNode last_value = head ;
        ListNode next_value = head.next ;

        while( next_value != null ) {
            if(last_value.val == next_value.val) {
                last_value.next = next_value.next ;
            }else {
                last_value = last_value.next ;
            }
            next_value = next_value.next ;
        }
        return head ;
    }
    
}
