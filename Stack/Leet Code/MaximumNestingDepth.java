/** Question link -> https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/ */

import java.util.Scanner;
import java.util.Stack;

public class MaximumNestingDepth {
    
    private static final Scanner input = new Scanner(System.in) ;
    private static final Stack<Character> stack = new Stack<>();
    private static String str ;

    public static void main(String[] args) {
        str = input.next();
        System.out.println(maxDepth(str));
    }

    public static int maxDepth(String s) {
        int counter = 0,max = 0 ;

        for(int i=0; i<s.length(); i+=1){
            if(s.charAt(i) == '('){
                stack.push('(') ;
                counter += 1 ;
            }
            else{
                if(s.charAt(i) == ')'){
                    stack.pop();
                    counter -= 1; 
                }
            }

            if(counter > max) max = counter ;
        }
        
        return max ;
    }
}