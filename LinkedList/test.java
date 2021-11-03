// import java.util.LinkedList;

class Solution 
{

    private static final SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    // private static LinkedList<Integer> list = new LinkedList<>();
    

    public static void main(String[] args) {

        list.add(10);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(13);

        System.out.println(list.count());
        System.out.println("___________________________"); 
        
        list.remove();
        list.remove(2);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("___________________________");

        System.out.println(list.sublist(1,4));
        System.out.println("___________________________");

        list.clear();
        
        list.add(9);
        list.add(7);

        System.out.println(list.contains(8));
        System.out.println("___________________________");
        
    }
    
    
}
