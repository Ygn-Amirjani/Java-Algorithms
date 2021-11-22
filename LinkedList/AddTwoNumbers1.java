/** Question link ->  https://leetcode.com/problems/linked-list-cycle/ */

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

public class AddTwoNumbers1 {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode one =  size(l1) >= size(l2) ? l1 : l2 ;
        ListNode two = size(l1) >= size(l2) ? l2 : l1 ;
        ListNode result = new ListNode(0) ;
        ListNode tmp = result ;
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
            tmp.next = new ListNode(divide);
        
        return result.next;
    }

    public int size(ListNode head) {
        ListNode tmp = head ;
        int counter = 0 ;
        while(tmp != null) {
            tmp = tmp.next ;
            counter += 1 ;
        }

        return counter ;

    }
}
