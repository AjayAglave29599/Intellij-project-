import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Hamcrest1 {
//    @Test
//    public void test() {
//        assertThat("Hello", is(anything()));
//        assertThat(13, describedAs("13 is not equal to 12", is(equalTo((12)))));
//        assertThat("World", is(equalTo("World")));
//    }
//@Test
//    public void testNull()
//    {
//        String email="ajay";
//        Assert.assertThat(email,is(not(nullValue())));
//    }


//    @Test
//    public void add()
//    {
//        int a=4;
//        Assert.assertTrue(3<4);
//    }


    @Test
    public void testAdditionIsCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}
