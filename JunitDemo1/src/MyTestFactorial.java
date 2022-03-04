import org.junit.Assert;
import org.junit.Test;

public class MyTestFactorial {
    @Test
    public void testFact()
    {
        int num=5;
        int result=120;
        Factorial f=new Factorial();
        int finalResult=f.fact(num);
        Assert.assertEquals(result,finalResult);
    }
}
