/** Question link -> https://leetcode.com/problems/add-two-numbers/ */

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

public class RemoveDuplicatesLinkedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null ;

        ListNode next_value = head.next ;
        ListNode last_value = head ;
        ListNode LatValue = null  ;
        boolean bool = false ;

        while(next_value != null) {
            if(last_value.val == next_value.val) {
                last_value.next = next_value.next ;
                bool = true ;
            } 
            else  {
                if(bool == true) {
                    if(LatValue == null)  {
                        last_value = last_value.next ;
                        head = next_value ;
                    }
                    else  {
                        LatValue.next = last_value.next ;
                        last_value = last_value.next ;
                    }

                    bool = false ;
                }
                else  {
                    LatValue = last_value ;
                    last_value = last_value.next ;

                }
            }

            next_value = next_value.next ;
        }
        if(bool == true)  {
            if(LatValue == null) 
                head = null ;
            else
                LatValue.next = null ;
        }

        return head ;
        
    }

}
