import java.util.*;

public class InfixToPostfix extends SupperPhrases{

    public String convert() 
    {
        priority.put('(', 0);
        priority.put(')', 4);

        for(int i=0; i<input_str.length(); i+=1) 
        {
            boolean bool = false;
            for(Map.Entry<Character, Integer> map : priority.entrySet()) 
            {
                if(input_str.charAt(i) == map.getKey()) {
                    if(input_str.charAt(i) == '(' || map.getValue() > stackPeekPriority())
                        stack.push(input_str.charAt(i));
                    else 
                    {
                        if(stack.peek() == ')') {
                            stack.pop();
                            while (stack.peek() != '(')
                                output_str += stack.pop();

                            stack.pop();
                        }
                        while(map.getValue() <= stackPeekPriority())
                            output_str += stack.pop();

                        stack.push(input_str.charAt(i));
                    }

                    bool = true;
                }
            }

            if(bool == false)
                output_str += input_str.charAt(i);
        }

        while(!stack.isEmpty())
            if(stack.peek() == '(' || stack.peek() == ')')
                stack.pop();
            else
                output_str += stack.pop();

        return output_str;
    }

}
