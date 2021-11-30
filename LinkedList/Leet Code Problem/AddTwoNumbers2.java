/** Question link -> https://leetcode.com/problems/add-two-numbers-ii/ */

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0) ;
        ListNode tmp = result ;        
        ListNode one =  l1 ;
        ListNode two = l2 ;
        int divide = 0 ;

        one = reverse(one);
        two = reverse(two);
        
        while (one != null) {
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
            tmp.next = new ListNode(divide) ;


        return reverse(result.next);

    }

    public ListNode reverse(ListNode head) {
        ListNode next_value = null ;
        ListNode last_value = null ;
        ListNode counter = head ;

        while(counter != null) {
            next_value = counter.next ;
            counter.next = last_value ;
            last_value = counter ;
            counter = next_value ;
        }

        head = last_value ;

        return head ;

    }

}
