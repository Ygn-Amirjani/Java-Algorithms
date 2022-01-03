import java.util.*;

public class InfixToPostfix {

    private static final Map<Character, Integer> priority = new HashMap<>();
    private static final Stack<Character> stack = new Stack<>();
    private static final Scanner input = new Scanner(System.in);
    private static String input_str, output_str = "";

    public static void main(String[] args) {
        priority.put('(', 0);
        priority.put('+', 1);
        priority.put('-', 1);
        priority.put('*', 2);
        priority.put('/', 2);
        priority.put('%', 2);
        priority.put('^', 3);
        priority.put(')', 4);

        input_str = input.next();
        System.out.println(Convert());
    }

    public static String Convert() {
        for (int i = 0; i < input_str.length(); i += 1) {
            boolean bool = false;
            for (Map.Entry<Character, Integer> map : priority.entrySet()) {
                if (input_str.charAt(i) == map.getKey()) {
                    if (input_str.charAt(i) == '(' || map.getValue() > stackPeekPriority())
                        stack.push(input_str.charAt(i));
                    else {
                        if (stack.peek() == ')') {
                            stack.pop();
                            while (stack.peek() != '(')
                                output_str += stack.pop();

                            stack.pop();
                        }
                        while (map.getValue() <= stackPeekPriority())
                            output_str += stack.pop();

                        stack.push(input_str.charAt(i));
                    }

                    bool = true;
                }
            }

            if (bool == false)
                output_str += input_str.charAt(i);
        }

        while (!stack.isEmpty())
            if (stack.peek() == '(' || stack.peek() == ')')
                stack.pop();
            else
                output_str += stack.pop();

        return output_str;
    }

    public static int stackPeekPriority() {
        if (!stack.isEmpty()) {
            for (Map.Entry<Character, Integer> map : priority.entrySet()) {
                if (stack.peek() == map.getKey())
                    return map.getValue();
            }
        }
        return -1;
    }

}
