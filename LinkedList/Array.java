import java.util.Arrays;

public class Array<E> 
{

    public final Object[] array ;  // create array
    public final int length_array ;

    /** Constructor to insert the length of array */
    public Array(int length_array)
    {

        array = new Object[length_array];
        this.length_array = length_array;
        
    }

    /** the getter method to return array[index] and cast to E */
    public E getArray(int index)
    {       

        @SuppressWarnings("unchecked")
        final E result = (E)array[index];

        return result ;
    }

    /** the setter method to Allows access  */
    public void setArray(int index, E result)
    {

        array[index] = result ;

    }

    @Override
    public String toString()
    {
        return Arrays.toString(array);
    }
    
}
