public class Node<E> {
    
    public Node<E> next ;
    /** Reference the next node -> (Link) */

    public E value ;
    /** The value of the node */

    /**Constructor  */
    public Node() 
    {

    }

    /** When the list is empty  */
    public Node(E value)
    {
        this(value, null) ;
    }

    /** When the list is not empty  */
    public Node(E value, Node<E> next)
    {
        this.value = value ;
        this.next = next ;
    }

}
