/** Question link ->  https://leetcode.com/problems/linked-list-components/ */

public class LinkedListComponents {
    public int numComponents(ListNode head, int[] nums) {
        // The solution is wrong :(

        int result = 0 ;

        while (head.next != null) {
            if (contains(nums, head.val)) {
                if (contains(nums, head.next.val)) 
                    result += 1 ;

                else 
                    result += 1 ;
                

                if (head != null) head = head.next ;

            }

            if (head != null) head = head.next ;
        }

        return result ;
    }

    public boolean  contains(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) 
                return true ;            
        }

        return false ;
    }
}
