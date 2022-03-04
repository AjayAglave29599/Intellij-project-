import org.junit.Assert;
import org.junit.Test;

public class MyGretestTest {
@Test
    public void gretestNumber()
    {
        int a=10;
        int b=20;
        int c=30;
        int result=30;
        Gretest g=new Gretest();
        int finalResult=g.gretest(a,b,c);
        Assert.assertEquals(result,finalResult);


    }
}
