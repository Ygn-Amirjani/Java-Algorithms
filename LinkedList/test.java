class Solution {

    private static final SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

    public static void main(String[] args) {

        list.add(10);
        list.add(8);
        list.add(5);
        list.add(3);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        
    }
    
    
}