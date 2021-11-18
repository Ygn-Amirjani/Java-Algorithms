/** Question link -> https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/ */

class Listnode {
    // Definition for singly-linked list.
    int val;
    Listnode next;

    Listnode() {

    }

    Listnode(int val) {
         this.val = val; 
    }

    Listnode(int val, Listnode next) { 
        this.val = val; this.next = next; 
    }

}

public class RemoveDuplicatesLinkedList2 {
    public Listnode deleteDuplicates(Listnode head) {
        if(head == null)
            return null ;

        Listnode next_value = head.next ;
        Listnode last_value = head ;
        Listnode LatValue = null  ;
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
