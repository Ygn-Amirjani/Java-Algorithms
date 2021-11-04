class Solution 
{

    private static final SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

    public static void main(String[] args) {

        list.add(10);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(13);

        list.reverse();

        System.out.println(list.sublist(1,4));
        System.out.println("---"); 
        System.out.println(list.contains(8));
        System.out.println("---"); 
        System.out.println(list.count());
        System.out.println("---"); 

        list.remove();
        list.remove(2);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        list.clear();
    }
    
    
}
