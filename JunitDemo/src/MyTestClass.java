import org.junit.Assert;

public class MyTestClass {

    public void additionTest()
    {
        int x=10;
        int y=20;
        int result=50;
        Calculate calculate=new Calculate();
        int finalresult=calculate.addition(x,y);
        Assert.assertEquals(result,finalresult);
    }
}
