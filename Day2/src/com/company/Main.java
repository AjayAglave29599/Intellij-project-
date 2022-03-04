package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // Pattern Code
//        int i,j;
//        System.out.println("Displaying Numbers:");
//        for(i=1;i< 10;i++)
//        {    for(j=1;j< i+1;j++)
//        {
//            System.out.print(" " +i);
//        }
//            System.out.println();
//        }


        // Sum Program
//        int n = 15;
//        int sum = 0;
//        for(int i = n;i>=0;i--)
//            sum = sum + i;
//        System.out.println("Sum = "+ sum);


        // Max and Min Number
        int i,great_no,small_no;
        int a[ ] = {5,78,1,6,74,9,6,4,6,7};
        System.out.println("Elements in the Array : ");
        for(i=0;i< 10;i++)
            System.out.print(a[i]+"\t");
        great_no = a[0]; small_no = a[0];
        for(i=1;i< 10;i++)
        {
            if(great_no< a[i])
            great_no = a[i];
        else if(small_no>a[i])
            small_no = a[i];
        }
        System.out.print("\nGreatest Number : "+great_no);
        System.out.print("\nSmallest Number : "+small_no);
    }
}



