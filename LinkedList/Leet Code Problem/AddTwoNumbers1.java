/** Question link ->  https://leetcode.com/problems/linked-list-cycle/ */

public class AddTwoNumbers1 {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0) ;
        ListNode tmp = result ;        
        ListNode one =  l1 ;
        ListNode two = l2 ;
        int divide = 0 ;

        while (one != null || two != null) {
            int x = one != null ? one.val : 0 ;
            int y = two != null ? two.val : 0 ;
            int sum = x + y + divide ;
            tmp.next = new ListNode(sum % 10);
            divide = sum / 10 ;

            if(two != null) two = two.next ;
            if(one != null) one = one.next ;
            tmp = tmp.next ;
        }
        
        if(divide > 0)
            tmp.next = new ListNode(divide);
        
        return result.next;
    }

}
