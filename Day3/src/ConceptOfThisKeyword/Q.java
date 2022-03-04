package ConceptOfThisKeyword;

public class Q extends P{

        int i;

    public Q(int a,int b)
    {
       super.i=a;
       this.i=b;
    }

    public void show()
    {
        System.out.println("i in the super class "+super.i);
        System.out.println("i in the chid class "+i);
    }
}
