/** Question link ->  https://leetcode.com/problems/remove-duplicates-from-sorted-list/ */

class listNode {
    // Definition for singly-linked list.
    int val;
    listNode next;

    listNode() {

    }

    listNode(int val) { 
        this.val = val; 
    }

    listNode(int val, listNode next) {
         this.val = val; this.next = next; 
    }
}

public class RemoveDuplicatesLinkedList {

    public listNode deleteDuplicates(listNode head) {
        if(head == null)
            return null ;
        
        listNode last_value = head ;
        listNode next_value = head.next ;

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
