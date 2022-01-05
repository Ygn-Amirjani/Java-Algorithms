public class MainPhrases {

    private static final InfixToPostfix infixToPostfix = new InfixToPostfix();
    private static final InfixToPrefix infixToPrefix = new InfixToPrefix();

    public static void main(String[] args) {

        infixToPostfix.Start();
        System.out.println("Output Infix To Postfix : "+infixToPostfix.convert());
        
        infixToPrefix.Start();
        System.out.println("Output Infix To Prefix : "+infixToPrefix.convert());

    }
}
