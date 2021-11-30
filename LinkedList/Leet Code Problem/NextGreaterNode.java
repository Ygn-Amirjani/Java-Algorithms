/** Question link ->  https://leetcode.com/problems/next-greater-node-in-linked-list/ */

public class NextGreaterNode {
    public int[] nextLargerNodes(ListNode head) {
        int[] array = new int[size(head)];
        ListNode nextval ;
        int i = 0 ;

        while (head.next != null) {

            nextval = head.next ;
            while (nextval != null) {
                if (head.val < nextval.val) {
                    array[i++] = nextval.val ;
                    nextval = null ;
                }
                else {
                    nextval = nextval.next ;
                    if (nextval == null) 
                        array[i++] = 0 ;
                }
            }

            head = head.next ;
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
