import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class CarArrayList implements CarList
{

    private Car[] array = new Car[10];
    private int size = 0;

    @Override
    public Car get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public void add(Car car) {
        if(size>=array.length)
        {
            array= Arrays.copyOf(array,array.length*2);
        }
        array[size] = car;
        size++;
    }

    @Override
    public boolean remove(Car car) {
        for(int i=0;i<size;i++) {
            if (array[i].equals(car))
            {
                return removeAt(i);
            }
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        return true;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    private void checkIndex(int index)
    {
        if(index < 0 || index>=size) {
            throw new IndexOutOfBoundsException();
        }
    }

    int n = 5;
}
