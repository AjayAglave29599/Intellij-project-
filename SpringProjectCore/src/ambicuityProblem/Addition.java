package ambicuityProblem;

public class Addition {

    private  int a;
    private int b;

    public Addition(int a, int b) {
        System.out.println("int ,int ");
        this.a = a;
        this.b = b;
    }
    public Addition(double a, double b) {
        System.out.println("double , double");
        this.a = (int)a;
        this.b = (int)b;
    }
    public Addition(String  a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }

    public void sum()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println("sum is = "+(a+b));
    }
}
