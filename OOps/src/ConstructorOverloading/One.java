package ConstructorOverloading;

public class One {

    int a;
    int b;
    int c;
    public One(int a)
    {
        this.a=a;
        this.b=a;
        this.c=a;
    }
    public One(int a,int b)
    {
        this.a=a;
        this.b=b;
        this.c=a;
    }

    public One (int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void display()
    {
        System.out.println(a+b+c);
    }
}
