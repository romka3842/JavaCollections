public class CarArrayList implements CarList
{

    private Car[] array = new Car[10];
    private int size = 0;

    @Override
    public Car get(int index) {
        if(index < 0 || index>=size)
            throw new
        return array[index];
    }

    @Override
    public void add(Car car) {

    }

    @Override
    public boolean remove(Car car) {
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }
}
