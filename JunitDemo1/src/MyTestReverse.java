import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;
public class MyTestReverse {
    @Test
    public void testReverse() {
        int num = 56;
        int result = 65;

        ReverseNumber r = new ReverseNumber();
        int finalResult = r.reverseNumber(num);
        Assert.assertEquals(result, finalResult);

    }
}
