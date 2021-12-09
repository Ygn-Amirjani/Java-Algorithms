/** Question link ->  https://leetcode.com/problems/add-two-numbers/ */

public class AddTwoNumbers1 {
    
    public ListNode addl2Numbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0) ;
        ListNode tmp = result ;        
        int divide = 0 ;

        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0 ;
            int y = l2 != null ? l2.val : 0 ;
            
            int sum = x + y + divide ;
            tmp.next = new ListNode(sum % 10);
            divide = sum / 10 ;

            if(l2 != null) l2 = l2.next ;
            if(l1 != null) l1 = l1.next ;
            tmp = tmp.next ;
        }
        
        if(divide > 0)
            tmp.next = new ListNode(divide);
        
        return result.next;
    }

}
