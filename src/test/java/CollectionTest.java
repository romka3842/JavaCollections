import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionTest {

    private  Collection carCollection;

    @Before
    public void setUp() throws Exception {

        carCollection = new CarHashSet();
        for (int i = 0; i<100;i++)
        {
            carCollection.add(new Car("Brand"+i,i));
        }

    }

    @Test
    public void contains(){
        assertTrue(carCollection.contains(new Car("Brand20",20)));
        assertFalse(carCollection.contains(new Car("Brand200",200)));
    }

}