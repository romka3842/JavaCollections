import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarSetTest {

    private CarHashSet carSet;

    @BeforeEach
    void setUp() throws Exception{
        carSet = new CarHashSet();
        for (int i = 0; i<100;i++)
        {
            carSet.add(new Car("Brand"+i,i));
        }
    }

    @Test
    void ifAddSameValue() {
        Car car = new Car("Brand1",1);
        assertFalse(carSet.add(car));

    }

    @Test
    void remove() {
    }

    @Test
    void size() {
    }

    @Test
    void clear() {
    }
}