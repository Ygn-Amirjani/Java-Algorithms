/** Question link -> https://leetcode.com/problems/merge-two-sorted-lists/ */

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode tmp = result ;

        while (l1 != null || l2 != null) {

            int x = l1 != null ? l1.val : 101 ;
            int y = l2 != null ? l2.val : 101 ;

            if(x < y) {
                tmp.next = new ListNode(l1.val);

                if(l1 != null)
                    l1 = l1.next ;
            }
            else {
                tmp.next = new ListNode(l2.val);

                if(l2 != null) 
                    l2 = l2.next ;
            }

            tmp = tmp.next ;
        }

        return result.next ;
    }

}