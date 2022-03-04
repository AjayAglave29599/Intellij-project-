import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest1 {

    @Test(timeout=10)

    public void testAdd() {

        Calculator1 instance = new Calculator1();

        assertEquals(7, instance.add(3,4));


    }



    @Test(timeout=7)

    public void testSubtract() {

        Calculator1 instance = new Calculator1();
        assertEquals(5, instance.subtract(10,5));



    }
}
