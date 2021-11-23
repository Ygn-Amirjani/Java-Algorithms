/** Question link -> https://leetcode.com/problems/add-two-numbers-ii/ */

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode one = size(l1) >= size(l2) ? l1 : l2 ;
        ListNode two = size(l1) >= size(l2) ? l2 : l1 ;
        ListNode result = new ListNode(0) ;
        ListNode tmp = result ;
        one = reverse(one);
        two = reverse(two);
        int divide = 0 ;

        while (one != null) {
            int x = two != null ? two.val : 0 ;
            int sum = x + one.val + divide ;
            tmp.next = new ListNode(sum % 10);
            divide = sum / 10 ;

            if(two != null)
                two = two.next ;

            one = one.next ;
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
