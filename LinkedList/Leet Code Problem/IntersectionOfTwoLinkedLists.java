/** Question link ->  https://leetcode.com/problems/intersection-of-two-linked-lists/ */

import java.util.*;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //?
        Set<ListNode> set = new HashSet<>();
        ListNode currA = headA;
        ListNode currB = headB;
        
        while(currA != null){
            set.add(currA);
            currA = currA.next;
        }

        while(currB != null){
            if(set.contains(currB))
                return currB;
            else
                currB = currB.next;
            
        }

        return null;
    }
    
}
