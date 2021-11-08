class Solution 
{

    private static final SinglyLinkedList<Integer> singlylist = new SinglyLinkedList<>();
    private static final CircleLinkedList<Integer> circlylist = new CircleLinkedList<>();
    private static final DoublyLinkedList<Integer> doublylist = new DoublyLinkedList<>();

    public static void main(String[] args) {

        singlylist.add(10);
        singlylist.add(8);
        singlylist.add(5);
        singlylist.add(4);
        singlylist.add(3);
        singlylist.add(6);
        singlylist.add(13);

        String s = singlylist.toString(1);
        System.out.println(s);
        System.out.println("---"); 

        singlylist.reverse();

        System.out.println(singlylist.sublist(1,4));
        System.out.println("---"); 
        System.out.println(singlylist.contains(8));
        System.out.println("---"); 
        System.out.println(singlylist.count());
        System.out.println("---"); 

        singlylist.remove(10);
        singlylist.remove(4);
        singlylist.remove(13);
        singlylist.remove();

        for(int i=0; i<singlylist.size(); i++){
            System.out.println(singlylist.get(i));
        }

        singlylist.clear();
        System.out.println("________________"); 

        circlylist.add(10); 
        circlylist.add(8);
        circlylist.add(5);
        circlylist.add(4);
        circlylist.add(3);
        circlylist.add(6);
        circlylist.add(13); 

        String str = circlylist.toString(3);
        System.out.println(str);
        System.out.println("---"); 

        circlylist.reverse(); 

        System.out.println(circlylist.sublist(2,6));
        System.out.println("---"); 
        System.out.println(circlylist.contains(7));
        System.out.println("---"); 
        System.out.println(circlylist.count());
        System.out.println("---"); 

        circlylist.remove(10);
        circlylist.remove(4);
        circlylist.remove(13);
        circlylist.remove();


        for(int i=0; i<circlylist.size()*2; i++){
            System.out.println(circlylist.get(i));
        }

        circlylist.clear();
        System.out.println("________________"); 

        doublylist.add(10); 
        doublylist.add(8);
        doublylist.add(5);
        doublylist.add(4);
        doublylist.add(3);
        doublylist.add(6);
        doublylist.add(13);

        doublylist.reverse();

        System.out.println(doublylist.countHead());
        System.out.println("---"); 
        System.out.println(doublylist.countTail());
        System.out.println("---"); 

        doublylist.remove(10);
        doublylist.remove(4);
        doublylist.remove(13);
        doublylist.remove();

        for(int i=0; i<doublylist.size(); i+=1){
            System.out.println(doublylist.get(i));
        }

        doublylist.clear();
        System.out.println("________________");
        
    }
    
    
}
