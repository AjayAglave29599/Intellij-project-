package com.company;

import ExceptionHandling.UserException;
import FunctionalPrograming.Factorial;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.*;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static <GenericList, Street, IAddable> void main(String[] args) throws IOException {
	// write your code here


        //  Lamda Expression Program
//        // TODO Auto-generated method stub
//        Scanner console = new Scanner(System.in);
//
//        // quiz the user on 3 addition problems
//        giveProblems(console, 3, "+", (x, y) -> x + y);
//
//        // quiz the user on 3 multiplication problems
//        giveProblems(console, 3, "*", (x, y) -> x * y);
//    }
//
//    private static void giveProblems(Scanner console, int count, String text, IntBinaryOperator operator) {
//        // TODO Auto-generated method stub
//        Random r = new Random();
//        int numRight = 0;
//        for (int i = 1; i <= count; i++) {
//            int x = r.nextInt(12) + 1;
//            int y = r.nextInt(12) + 1;
//            System.out.print(x + " " + text + " " + y + " = ");
//            int answer = operator.applyAsInt(x, y);
//            int response = console.nextInt();
//            if (response == answer) {
//                System.out.println("you got it right");
//                numRight++;
//            } else {
//                System.out.println("incorrect...the answer was "
//                        + answer);
//            }
//        }
//        System.out.println(numRight + " of " + count + " correct");
//        System.out.println();


        // compute the sum of the squares of integers 1-5

//        int sum=0;
//
//        for (int i=0; i<=5; i++)
//        {
//            sum=sum+ i*i;
//        }
//        System.out.println(sum);


        // compute the sum of the squares of integers 1-5
//        int sum= IntStream.range(1,6)
//                .map(n -> n*n)
//                .sum();
//        System.out.println(sum);


        // compute the sum of squares of odd integers
//        int sum =
//                IntStream.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3)
//                        .filter(n -> n % 2 != 0)
//                        .map(n -> n * n)
//                        .sum();
//
//        System.out.println(sum);


        // print largest multiple of 10 in list
        // (does not compile!)
//        OptionalInt largest =
//                IntStream.of(55, 20, 19, 31, 40, -2, 62, 30)
//                        .filter(n -> n % 10 == 0)
//                        .max();
//        System.out.println(largest.getAsInt());


        //Factorial number


//        Factorial factorial=new Factorial();
//        int fact=factorial.factorial(5);
//        System.out.println(fact);


        // compute sum of absolute values of even ints
//        int[] numbers = {3, -4, 8, 4, -2, 17,
//                9, -10, 14, 6, -12};
//        int sum = Arrays.stream(numbers)
//                .map(n -> Math.abs(n))
//                .filter(n -> n % 2 == 0)
//                .distinct()
//                .sum();
//        System.out.println(sum);


        // compute sum of absolute values of even ints


//        int[] numbers = {3, -4, 8, 4, -2, 17,
//                9, -10, 14, 6, -12};
//        int positiveNum=10;
//        int negativeNum=-15;
//        System.out.println(Math.abs(negativeNum));
//        System.out.println(Math.abs(positiveNum));
//        IntStream s= Arrays.stream(numbers);
//        //System.out.println("Integer Stream from Arrays "+s.count());
//        System.out.println("Integer Stream from Arrays "+s.sum());
//        int sum = Arrays.stream(numbers)
//                .map(n -> Math.abs(n))  // abs stands for absolute value only positive value
//                .filter(n -> n % 2 == 0)
//                .distinct()
//                .sum();



        // compute sum of absolute values of even ints
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(-42);
//        list.add(-17);
//        list.add(68);
//        list.stream()
//                .map(Math::abs)
//                .forEach(System.out::println);

        // convert into set of lowercase words
//        List<String> words = Arrays.asList(
//                "To", "be", "or", "Not", "to", "be");
//        Set<String> words2 = words.stream()
//                .map(String::toLowerCase)
//                .collect(Collectors.toSet());
//        System.out.println("word set = " + words2);

        // convert into set of lowercase words

//        List<String> words =Arrays.asList("To", "be", "or", "Not", "to", "be");
//
//        Set<String> words2= words.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toSet());
//        System.out.println("word set = " + words2);



        // Generics

//        ArrayList<String> list2 =
//                new ArrayList<String>();
//        list2.add( "Isabelle" );
//        System.out.println(     list2.get(0).charAt(2) ); //ok
//        list2.add(String.valueOf(new Rectangle()));
// syntax error


        //Demo for Arithmetic Exception

//        int a=10,b;
//        b=a/0;
//        System.out.println ("value="+b);



        //  ###### Exception Handling in java


        //Java program demo for predefined Exceptions

//        int a,b,c;
//        System.out.println("Enter two integer values");
//        Scanner scon = new Scanner(System.in);
//        a = scon.nextInt();
//        b = scon.nextInt();
//        try
//        {    c=a/b;
//            System.out.println ("Quotient="+c);
//        }
//        catch(Exception e)
//        {    System.out.println(e);
//        }

        //Java Program Demo for Userdefined Errors

//        int a,b;
//        a=10; b=0;
//        try
//        {    if(b==0)
//            throw new UserException();
//        else
//            System.out.println("Q"+a/b);
//        }
//        catch(Exception e)
//        {
//        }



        // Runtime Exceptiom

//        int x=10;
//        int y=0;
//        try {
//            int z=x/y;
//            System.out.println(z);
//        }catch (ArithmeticException e) {
//            // TODO: handle exception
//            System.out.println("One value is Zero " + e);
//        }

        // compile time exception

//        File f=new File("hello.txt");
//        try {
//            FileWriter fileWriter=new FileWriter(f);
//            fileWriter.write("Hi i am writing a file");
//            fileWriter.close();
//        } catch (IOException e) {   // Compile time exception
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }


        // cheked Exception

       // Thread.sleep(300);

        // Unchecked Exception

       // int c=5/0;
        //System.out.println(c);



        // Null Pointer Exception

//        try
//        {    double x=100.25;
//            DecimalFormat d=null;
//            System.out.println(d.format(x));
//        }
//        catch(NullPointerException e)
//        {    System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            e.printStackTrace();
//        }


        //Demo for the Multiple catch statements nested try statements


//        try
//        {    int a=args.length;
//            System.out.println("a="+a);
//            int b=42/a;
//            System.out.println(b);
//        }
//        catch(ArithmeticException e)
//        {    System.out.println(e.getMessage());
//        }
//        try
//        {    int c[]={1};
//            c[40]=99;
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {    System.out.println(e.getMessage());
//        }

        //Demo for the throw statement

//        try
//        {
//            throw new ArithmeticException("Hello");
//        }
//        catch(ArithmeticException e)
//        {    System.out.println(e.getMessage());
//        }


        //Demo for ArrayIndexOutOfBoundsException

//        int x[]=new int[10];
//        try
//        {    x[20]=100;
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            //System.out.println("Exception cought");
//           // //throw new Exception("Arithmetic Exception  a");
//        }
//        finally
//        {      System.out.println("Not Possible to print");
//            System.out.println("quit");
//        }



//        try {
//           System.out.println(args[0]);
//
//        }catch (ArrayIndexOutOfBoundsException e) {
//            // TODO: handle exception
//            System.out.println("Exception "+ e);
//        }
//        finally {
//            System.out.println(args[0]);
//            System.out.println("Finnally Block executed");
//        }

    }
}
