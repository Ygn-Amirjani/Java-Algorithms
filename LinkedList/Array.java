import java.util.Arrays;

public class Array<E> 
{

    public final Object[] array ;
    public final int length_array ;

    public Array(int length_array)
    {

        array = new Object[length_array];
        this.length_array = length_array;
        
    }

    public E getArray(int index)
    {       

        @SuppressWarnings("unchecked")
        final E result = (E)array[index];

        return result ;
    }

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
