package com.company;

import Rectangle.CallByValue;
import Rectangle.Cube;
import Rectangle.RectangleArea;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
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
//        int i,great_no,small_no;
//        int a[ ] = {5,78,1,6,74,9,6,4,6,7};
//        System.out.println("Elements in the Array : ");
//        for(i=0;i< 10;i++)
//            System.out.print(a[i]+"\t");
//        great_no = a[0]; small_no = a[0];
//        for(i=1;i< 10;i++)
//        {
//            if(great_no< a[i])
//                great_no = a[i];
//            else if(small_no>a[i])
//                small_no = a[i];
//        }
//        System.out.print("\nGreatest Number : "+great_no);
//        System.out.print("\nSmallest Number : "+small_no);


        // Calculate Area of rectangle

//        RectangleArea r=new RectangleArea();
//        r.get(10,20);
//        r.area();




        // Call by value

//        CallByValue c=new CallByValue();
//        int a=10;
//        int b=50;
//
//        System.out.println("before calling "+"a="+a+" b="+b);
//        c.math(a,b);
//


        // Class and Object initialization use of static fields and static method class Cube

//        System.out.println("Number of Cube objects = "+ Cube.numOfCubes);
//        System.out.println("Number of Cube objects = "+ Cube.getNoOfCubes());



        // Array Program

//        int[ ] x = new int [101];
//        for (int i = 0; i< x.length; i++ )
//            x[i] = i;
//        int sum = 0;
//        for(int i = 0; i< x.length; i++)
//            sum =sum+ x[i];
//        System.out.println(sum);


        //Java program to read 5 numbers and print sum using 1d class program

//        int sum=0;
//        int n[ ]=new int [10];
//        for(int i=0;i<5;i++)
//        {    n[i]=i;
//            sum=sum+n[i];
//        }
//        System.out.println(sum);


        // array Sorting

//        int a []={4,1,2,5,3};
//
//        for (int i=0; i<a.length; i++)
//        {
//            for (int j=i+1; j<a.length; j++)
//            {
//                if(a[i]>a[j])
//                {
//                    int temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        for (int i=0; i<a.length; i++)
//        {
//            System.out.print(a[i]);
//        }


        // Copy Array

//        System.out.printf("Before (original)\t%s%n", Arrays.toString(args));
//        String copy[] = Arrays.copyOf(args, 4);
//        System.out.printf("Before (copy)\t\t%s%n", Arrays.toString(copy));
//        copy[0] = "A";
//        copy[1] = "B";
//        copy[2] = "C";
//        copy[3] = "D";
//        System.out.printf("After (original)\t%s%n", Arrays.toString(args));
//        System.out.printf("After (copy)\t\t%s%n", Arrays.toString(copy));


      ////Java program to read 5 numbers and print sum using 1D

//        int sum=0;
//        int n[ ]=new int [10];
//        for(int i=0;i<5;i++)
//        {    n[i]=Integer.parseInt(args[i]);
//            sum=sum+n[i];
//        }
//        System.out.println(sum);


        // array Scanneer Program

//        Scanner con = new Scanner(System.in);
//        System.out.println("ENTER NUMBER OF ELEMENTS IN ARRAY");
//        int sum=0;
//        int n=con.nextInt();
//        int arr[]=new int[n];
//        System.out.println("Enter array elements");
//        for(int i=0;i<arr.length;i++)
//        {
//            arr[i]=con.nextInt();
//            sum+=arr[i];
//        }
//        System.out.println("sum of array elements is:"+sum);




        //java program for arraycopydemo

//        char[ ] copyFrom = {'a','b','c','d','e','f','g','h','i','j'};
//        char[ ] copyTo = new char[5];
//        System.arraycopy(copyFrom, 2, copyTo, 0, 5);
//        System.out.println(new String (copyTo));


        // Find length of array

//        int n;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the array size");
//
//        n=sc.nextInt();
//        int [] a =new int[n];
//        System.out.println("enter the element in the array");
//        for (int i=0; i<n; i++)
//        {
//            a[i]=sc.nextInt();
//        }
//
//        System.out.println("Array length = "+a.length );


        //java program for Two-Dimensional Array public class twoDimension

//        int[ ][ ] a2 = new int[10][5];
//        for (int i=0; i<a2.length; i++)
//        {
//            for (int j=0; j<a2[i].length; j++)
//            {
//                a2[i][j] = i;
//                System.out.print(" " + a2[i][j]);
//            }
//            System.out.println("");
//        }



        // Java Implementation of Matrix Operation Using Arrays class Matrix

//        int i,j,k;
//        int mat1 [ ][ ]={ {2,2,2}, {2,2,2}, {2,2,2} };
//        int mat2 [ ][ ]={ {2,2,2}, {2,2,2}, {2,2,2} };
//        System.out.println("Operation ON Matrices \n1.Addition \n");
//        int sum [ ][ ] = new int [3][3];
//        for(i=0;i <3;i++)
//        {    for(j=0;j< 3;j++)
//        {    sum[i][j] = mat1[i][j] + mat2[i][j];
//            System.out.print("\t" + sum[i][j]);
//        }System.out.println("\t");
//        }
//        System.out.println("2.Subtraction\n");
//        int diff[ ][ ] = new int[3][3];
//        for(i=0;i< 3;i++)
//        {    for(j=0;j< 3;j++)
//        {    diff [i][j] = mat1[i][j] - mat2[i][j];
//            System.out.print("\t"+ diff[i][j]);
//        }System.out.println("\t");
//        }
//        System.out.println("3.Multiplication\n");
//        int prod[ ][ ] = new int[3][3];
//        for(i=0;i< 3;i++)
//        {    for(j=0;j< 3;j++)
//        {    prod[i][j] = 0;
//            {    for(k=0;k< 3;k++)
//                prod[i][j] = prod[i][j]+mat1[i][k]*mat2[k][j];
//            }
//            System.out.print("\t"+ prod[i][j]);
//        }System.out.println("\t");
//        }
//
//

        // Transpose of matrix

//        int [][] a={{1,2,3},
//                    {4,5,6},
//                    {7,8,9}};
//        int [] [] b=new int [3][3];
//
//        for (int i=0; i<3; i++)
//        {
//            for (int j=0; j<3; j++)
//            {
//                b[i][j]=a[j][i];
//            }
//        }
//        for (int i=0; i<3; i++)
//        {
//            for (int j=0; j<3; j++)
//            {
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }



        // Create String


//        String s = new String();
//        Scanner scn=new Scanner(System.in);
//        System.out.println(s);
//                s = scn.nextLine();
//        System.out.println("  "+s);
//        System.out.println("length:"+s.length());


        // Read character program
//        char c;
//        System.out.println("enter the char");
//
//        c=(char)System.in.read();
//        System.in.read();
//        System.out.println("you enter "+c);


        // String ( Equal & == )Concept

//        String s="ajay";
//        String s1=s;
//        String s2="ajay";
//        String s3=new String("ajay");
//        String s4=new String("ajay");
//        System.out.println("==Comparision : "+(s==s4));
//        System.out.println("==Comparision : "+(s==s1));
//        System.out.println("Using equals method : "+ s.equals(s1));
//        System.out.println("== comparison : " + s2 == s3);
//        System.out.println("Using equals method : " + s2.equals(s3));


        // Start with-- Ends wioth--indexOf--toUppercase
//        String s1="RAJA SEKHAR";
//        String s2="RAJ";
//        String s3="HA";
//        System.out.println("String 1 "+s1);
//        System.out.println("String 1 "+s2);
//        System.out.println("String 1 "+s3);
//        System.out.println("String 1 Length "+s1.length());
//        System.out.println("String 1 is begins with String 2 "+s1.startsWith(s2));
//        System.out.println("String 1 is ends with String 3 "+s1.endsWith(s3));
//        System.out.println("String 3 Position in Stirng 1 "+s1.indexOf(s2));
//        System.out.println("String 1 Upper Case "+s1.toUpperCase());

        //java program to find comparison strings.

//        String s="i love";
//        String s1="my india";
//        if((s1.compareTo(s))>0)
//            System.out.println("s1 is greater than s");
//        else if (s.compareTo(s1)>0)
//            System.out.println ("s is greater than s1");
//        else
//            System.out.println ("two strings are eqal");

        //java program to concatenate the strings

//        String s="i love my ";
//        String s1=s.concat("india");
//        System.out.println(s1);

        //java program to find substring of given string

//        String s="i love my india";
//        System.out.println(s.substring(2,6));

        //java program to replace any string.

//        String s="india ";
//        System.out.println(s.replace(' ','n'));

        //java program to convert lowercase.

//        String s="I LOVE MY INDIA";
//        System.out.println(s.toLowerCase());


        //java program to convert uppercase letters.

//        String s="i love my india";
//        System.out.println(s.toUpperCase());


        //java program to trim the string.

//        String s="       india    ";
//        System.out.println(s.trim());

        //Converting Strings to Numbers

//        if (args.length == 2)
//        {    //convert strings to numbers
//            float a = (Float.valueOf(args[0]) ).floatValue();
//            float b = (Float.valueOf(args[1]) ).floatValue();
//            System.out.println("a + b = " + (a + b) );
//            System.out.println("a - b = " + (a - b) );
//            System.out.println("a * b = " + (a * b) );
//            System.out.println("a / b = " + (a / b) );
//            System.out.println("a % b = " + (a % b) );
//        }
//        else
//        {
//            System.out.println("This program requires two command-line arguments.");
//        }



        //## String Buffer demo

//        StringBuffer s=new StringBuffer("ajay");
//        System.out.println(s.reverse());

        // StringBuffer Capacity

//        StringBuffer s1,s2,s3;
//
//        s1=new StringBuffer();
//        s2=new StringBuffer("very good");
//        s3=new StringBuffer(50);
//
//        System.out.println(s1.capacity());
//        System.out.println(s2.capacity());
//        System.out.println(s3.capacity());
//
//        System.out.println(s1.capacity()+s2.capacity()+s3.capacity());



        // in String Buffer capacity-delete-charAt-length

//        String s=new String("SRIVENKATESWARA");
//        StringBuffer stb = new StringBuffer(s);
//        stb.reverse();
//        System.out.println("Reverse is:"+stb);
//        System.out.println("capacity is:"+stb.capacity());
//        System.out.println("character at:"+stb.charAt(3));
//        System.out.println("delete 2,4:"+stb.delete(2,4));
//        System.out.println("delete char at:"+stb.deleteCharAt(3));
//        System.out.println("Insert at:"+stb.insert(2,'o'));
//        System.out.println("replace:"+stb.replace(2,3,"sr"));


        // String Tokenizer

        int sum=0;
        String s1="This is good for none";
        StringTokenizer st1=new StringTokenizer(s1);
        System.out.println("No. of Words "+st1.countTokens());
        sum=st1.countTokens()-1;
        while(st1.hasMoreTokens())
            sum=sum+st1.nextToken().length();
        System.out.println("No. of Chars "+sum);


    }
}
