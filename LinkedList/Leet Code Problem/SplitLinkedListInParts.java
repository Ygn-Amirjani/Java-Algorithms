public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k] ;
        int x = size(head) > k ? (size(head) / k) : 1 ;
        int y = size(head) > k ?  (size(head) % k) : 0 ;
        
        for(int i=0; i<k; i+=1) {
            if(head == null) break ;
            if( i == 0 && y != 0 ){
                for (int j = 0; j <(x + y); j++) {
                    result[i] = new ListNode(head.val);
                    head = head.next ;
                }
            }
            for (int j=0; j<x; j++) {
                result[i] = new ListNode(head.val);
                 head = head.next ;
            }
        }
        return result ;
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
