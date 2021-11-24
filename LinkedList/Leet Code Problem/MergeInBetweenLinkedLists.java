/** Question link -> https://leetcode.com/problems/merge-in-between-linked-lists/ */

public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode result = new ListNode(0);
        ListNode tmp = result ;
        long counter = 0 ;

        while (list1 != null) {

            if(counter == a) {

                while (list2 != null) {

                    tmp.next = new ListNode(list2.val);
                    list2 = list2.next ;

                    while (counter != b) {
                        list1 = list1.next ;
                        counter++; 
                    }
                    
                    tmp = tmp.next ;
                }
            }
            else {

                tmp.next = new ListNode(list1.val);
                tmp = tmp.next ;
            }

            list1 = list1.next ;
            counter++;  
        }

        return result.next ;     
    }

}
