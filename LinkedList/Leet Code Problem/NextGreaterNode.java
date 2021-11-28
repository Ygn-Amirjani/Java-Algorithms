/** Question link ->  https://leetcode.com/problems/next-greater-node-in-linked-list/ */

public class NextGreaterNode {
    public int[] nextLargerNodes(ListNode head) {

        int[] array = new int[size(head)];
        ListNode last = head ;
        ListNode nextval ;
        int i = 0 ;

        while (last.next != null) {

            nextval = last.next ;
            while (nextval != null) {
                if (last.val < nextval.val) {
                    array[i++] = nextval.val ;
                    nextval = null ;
                }
                else {
                    nextval = nextval.next ;
                    if (nextval == null) 
                        array[i++] = 0 ;
                }
            }

            last = last.next ;
        }
        
        return array ;
    }

    public int size(ListNode head) {
        ListNode tmp = head ;
        int counter = 0 ;

        while (tmp != null) {
            tmp = tmp.next ;
            counter += 1 ;
        }

        return counter ;
    }

}
