package BinarySearch;

import java.util.Scanner;

public class Binary {

    Scanner sc=new Scanner(System.in);

    int n;
    int [] a;
    int ele;
    int count;
    int mid;


    public void binary()
    {
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        a=new int[n];
    }
    public void enterElementInArray()
    {
        System.out.println("enter the element in the array");
        for (int i=0; i<a.length; i++)

            a[i]=sc.nextInt();


        System.out.println("Enter element to be search");

        ele=sc.nextInt();
    }

    public void search()
    {
        int start=0;
        int end=a.length-1;


        while(true )
        {
             mid=(start+end)/2;
             if(ele==a[mid])
             {
                 System.out.println("element is found at "+mid);
                 count=1;
                 break;
             }
            else if(ele<a[mid])
            {
                end=mid-1;
            }
            else if(ele>mid)
            {
                start=mid+1;
            }

        }
        if(count!=1)
        {
            System.out.println("element is not found");
        }

    }
}
