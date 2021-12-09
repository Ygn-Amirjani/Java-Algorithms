/** Question link ->  https://leetcode.com/problems/linked-list-components/ */

public class LinkedListComponents {

    public int numComponents(ListNode head, int[] nums) {
        int result = 0 ;
        while (head != null) {
            if (contains(nums, head.val)) {
                result += 1 ;
                while (head.next != null && contains(nums, head.next.val))
                    if(head != null) head = head.next ;
                
            }

            if(head != null) head = head.next ;
        }
        return result ;
    }

    public boolean contains(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) 
                return true ;            
        }
        return false ;
    }
    
}
