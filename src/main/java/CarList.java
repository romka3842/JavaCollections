public interface CarList extends Collection{
    Car get(int index);
    boolean removeAt(int index);
    boolean add(Car car, int index);
}
