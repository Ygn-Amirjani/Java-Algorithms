public class MainStack {
    
    private static final StackOfLinkedList<Integer> stackOfLinkedList = new StackOfLinkedList<>();
    private static final StackOfArrayList<Integer> stackOfArrayList = new StackOfArrayList<>();
    
    public static void main(String[] args) {
        
        stackOfArrayList.push(10);
        stackOfArrayList.push(9);
        stackOfArrayList.push(8);
        stackOfArrayList.push(7);
        stackOfArrayList.push(6);
        stackOfArrayList.push(5);
        stackOfArrayList.push(4);
        stackOfArrayList.push(3);

        System.out.println(stackOfArrayList.size());
        for(int i=0; i<3; i+=1)
            System.out.println(stackOfArrayList.pop());

        System.out.println(stackOfArrayList.size());
        System.out.println(stackOfArrayList.search(3));
        System.out.println(stackOfArrayList.search(6));

        System.out.println("-----------------------");

        stackOfLinkedList.push(10);
        stackOfLinkedList.push(9);
        stackOfLinkedList.push(8);
        stackOfLinkedList.push(7);
        stackOfLinkedList.push(6);
        stackOfLinkedList.push(5);
        stackOfLinkedList.push(4);
        stackOfLinkedList.push(3);

        System.out.println(stackOfLinkedList.size());
        for(int i=0; i<3; i+=1)
            System.out.println(stackOfLinkedList.pop());

        System.out.println(stackOfLinkedList.size());
        System.out.println(stackOfLinkedList.peek());
        System.out.println(stackOfLinkedList.search(3));
        System.out.println(stackOfLinkedList.search(6));



    }
}
