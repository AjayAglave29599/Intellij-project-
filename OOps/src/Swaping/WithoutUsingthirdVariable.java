package Swaping;

import java.util.Scanner;

public class WithoutUsingthirdVariable {

    Scanner sc=new Scanner(System.in);
    // Take two value from user

    int x=sc.nextInt();
    int y=sc.nextInt();


    public void swap()
    {    x=x+y;
        y=x-y;
        x=x-y;
    }
    public void display()
    {

        System.out.println ("value of x: "+x+"  value of y: "+y);

    }
}
