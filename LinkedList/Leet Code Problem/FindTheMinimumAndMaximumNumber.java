public class FindTheMinimumAndMaximumNumber {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] array = new int[2];
        ListNode result = head.next ;
        ListNode lasNode = head ;
        int maximum = -1 ;
        int minimum = -1 ;

        while (result.next != null) {
            if (result.val > lasNode.val && result.val > result.next.val) {
                maximum = result.val ;
            }
            else {
                if (result.val < lasNode.val && result.val < result.next.val) {
                    minimum = result.val ;
                }
            }

            result = result.next ;
            lasNode = lasNode.next ;
        }
        
        array[0] = minimum;
        array[1] = maximum;
        
        return array ;
    }
}
