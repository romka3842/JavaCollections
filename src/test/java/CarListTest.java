import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarListTest {
    private CarList carList;

    @Before
    public void setUp() throws Exception {
        carList = new CarArrayList();
        for (int i = 0; i<100;i++)
        {
            carList.add(new Car("Brand"+i,i));
        }
    }

    @Test
    public void whenAdded100ElementsTheSizeMustBe100()
    {
        assertEquals(100,carList.size());
    }

    @Test
    public void whenElementRemoveByIndexTheSizeMustBeDecrease()
    {
        assertTrue(carList.removeAt(5));
        assertEquals(99,carList.size());

    }

    @Test
    public void whenElementRemoveTheSizeMustBeDecrease()
    {
        Car car = new Car("Toyota",15);
        carList.add(car);
        assertEquals(101,carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100,carList.size());
    }

    @Test
    public void whenElementNonExistentElementRemovedTheReturnFalse()
    {
        Car car = new Car("Toyota",15);
        assertFalse(carList.remove(car));
        assertEquals(100,carList.size());
    }

    @Test
    public void whenListClearedThenSizeMustBeZero()
    {
        carList.clear();
        assertEquals(0,carList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutOfBounds()
    {
        carList.get(100);
    }

    @Test
    public void methodGetReturnedRightValue()
    {
        Car car = carList.get(0);
        assertEquals("Brand0",car.getBrand());
    }

    @Test
    public void insertintomiddle()
    {
        Car car = new Car("BMW",1);
        carList.add(car,50);
        Car carFromList = carList.get(50);
        assertEquals("BMW",carFromList.getBrand());
    }
}