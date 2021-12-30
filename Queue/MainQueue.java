public class MainQueue {
    
    private static final QueueOfLinkedList<Integer> queueOfLinkedList = new QueueOfLinkedList<>(4);

    public static void main(String[] args) {
        
        queueOfLinkedList.add(10);
        queueOfLinkedList.add(8);
        queueOfLinkedList.add(5);
        queueOfLinkedList.add(3);
        // queueOfLinkedList.add(1);

        System.out.println(queueOfLinkedList.element());
        queueOfLinkedList.remove();
        System.out.println(queueOfLinkedList.element());
        System.out.println(queueOfLinkedList.size());
        queueOfLinkedList.clear();

        System.out.println("----------------------");

        queueOfLinkedList.offer(10);
        queueOfLinkedList.offer(8);
        queueOfLinkedList.offer(5);
        queueOfLinkedList.offer(3);
        queueOfLinkedList.offer(1);

        System.out.println(queueOfLinkedList.size());
        System.out.println(queueOfLinkedList.peek());
        queueOfLinkedList.poll();
        System.out.println(queueOfLinkedList.peek());

     
    }
}
