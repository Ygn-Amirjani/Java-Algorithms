/** Question link ->  https://leetcode.com/problems/odd-even-linked-list/ */

public class OddEvenLinkedList {
    
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null ;

        ListNode result = new ListNode(head.val);
        ListNode tmp = result ;
        int number = 0 , odd = 1 ;
        head = head.next ;

        while (head != null) {
            if (number % 2 == 0) {
                tmp.next = new ListNode(head.val) ;
                tmp = tmp.next ;
            }
            else {
                ListNode tmpNode = new ListNode(head.val) ;
                ListNode counter = result ;

                for(int i=0; i<odd-1; i= i+1)
                    counter = counter.next ;

                tmpNode.next = counter.next ;
                counter.next = tmpNode ;
                odd = odd + 1 ;
            }

            head = head.next ;
            number = number + 1 ;
        }

        return result ;

    }
    
}
