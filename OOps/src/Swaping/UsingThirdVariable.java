package Swaping;



import java.util.Scanner;

public class UsingThirdVariable {

    Scanner sc=new Scanner(System.in);
    // Take two value from user
    int x=sc.nextInt();
    int y=sc.nextInt();

    public void swap()
    {
        int temp=x;
        x=y;
        y=temp;
    }
    public void display()
    {

        System.out.println ("value of x: "+x+"  value of y: "+y);
    }

}
