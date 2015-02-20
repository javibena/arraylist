import java.util.Arrays;

public class ArrayListInt
{

    private int[] array;

    public ArrayListInt()
    {
        array = new int [0];
    }

    public void add (int elemento)
    {
        int tamaño = array.length;
        array = Arrays.copyOf(array, tamaño + 1);
        array[tamaño] = elemento;
    }

    public void add (int index, int elemento)
    {
        int tamaño = array.length;
        int posicion = array[index];
        int contador = 0;
        if(index <= tamaño && index >= 0)
        {
            for(int i = 0; )
            {
                
            }
        }

    }

    public void clear()
    {
        array = new int[0];
    }

    public boolean contains (int elemento)
    {
        boolean element = false;

        for(int valorTemp: array)
        {
            if (elemento == valorTemp)
            {
                element = true;
            }
        }
        return element;
    }

    public int get(int index)
    {
        int posicion = -1;
        if (index <= array.length && index >= 0)
        {
            posicion = array[index];
        }
        return posicion;
    }

    public void set(int index, int elemento)
    {
        if(index >= 0 && index <= array.length)
        {
            array[index] = elemento;
        }
    }

    public boolean isEmpty()
    {
        boolean vacio = false;
        if(array.length == 0)
        {
            vacio = true;
        }
        return vacio;
    }

    public void remove(int index)
    {

    }

    public int size()
    {
        int tamaño = array.length;
        return tamaño;
    }
}
