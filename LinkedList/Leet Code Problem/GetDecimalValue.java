/** Question link -> https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/ */

public class GetDecimalValue {

    public int getDecimalValue(ListNode head) {
      
      ListNode result = head ;
      int power = size(head) - 1 ;
      int sum = 0 ;
      
      while (result != null) {
        sum = sum + (result.val * (int)Math.pow(2, power));
        result = result.next ;
        power = power - 1 ;
      }

      return sum ;

      /* A simple solution to the problem as stated by Leetcode itself :

      int num = head.val;
      while (head.next != null) {
          num = num * 2 + head.next.val;
          head = head.next;    
      }
      return num;

      */
      
    }

    public int size(ListNode head) {
        ListNode tmp = head ;
        int counter = 0 ;

        while (tmp != null) {
            tmp = tmp.next ;
            counter =  counter + 1 ;
        }

        return counter ;

    }
}
