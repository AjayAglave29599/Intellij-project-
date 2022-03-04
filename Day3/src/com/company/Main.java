package com.company;

import CompileTimePolymorphism.A;
import ConceptOfThisKeyword.Counter;
import ConceptOfThisKeyword.Q;
import FinalKeywordUse.Pqrs;
import Interface.Class1;
import LateBindingAndEarlyBindingConcept.Car;
import LateBindingAndEarlyBindingConcept.Vehicle;
import MultiLevelInheritanceInSuperKeywordUse.B;
import MultiLevelInheritanceInSuperKeywordUse.C;
import OverRidingConceptWithInheritqnce.Base;
import OverRidingConceptWithInheritqnce.Derived1;
import OverRidingConceptWithInheritqnce.Derived2;
import OverloadingConcept.MethodOverloading;
import RodentInheritance.Gerbil;
import RodentInheritance.Hamster;
import RodentInheritance.Mouse;
import RodentInheritance.Rodent;
import SuperKeywordUse.Two;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

//        int n=Integer.parseInt(args[0]);
//        double sum=0.0;
//        for(int i=1;i<=n;i++)
//            sum=sum+(1.0/i);
//        System.out.println("Sum is "+sum);



//        int n=Integer.parseInt(args [0]);
//        double sum=0.0;
//        for (int i=1; i<=n; i++)
//        {
//            sum=sum+(1/Math.pow(2,i));
//        }
//        System.out.println(sum);


        // Use of super keyword

//        Two t=new Two(10,"ajay");


//        A a=new A();
//        B b=new B();
//        C c=new C();
//
//        a.show();
//        b.show();
//        c.show();



        // Method Overloading Concept

//        MethodOverloading m=new MethodOverloading();
//        m.show();
//        m.show(10);
//        m.show(10,20);
//        m.show(5,6);


        // late Binding and eary binding Concept

//        Vehicle v=new Car();
//        v.start();
//        v.stop();



        // OverloadingConceptWithInheritance

//        Base b=new Base();
//        Derived1 d1=new Derived1();
//        Derived2 d2=new Derived2();
//        b.show();
//        d1.show();
//        d2.show();



        // Polymorphism

//        A a=new A();
//        // Here compiler decides that fun1(int) is to be called and "int" will be printed.
//        a.fun1(10);
//        // Here compiler decides that fun1(int,int) is to be called and "int and int" will be printed.
//        a.fun1(10,20);


        // final keyword use

//        Pqrs p=new Pqrs();
//        p.show();
//        p.print();

        //Variable in subclass hides the variable in the super class

//        Q q=new Q(10,20);
//        q.show();

        //write a java program the concept of if-else using final for constant

//        final int MONDAY = 1;
//        final int TUESDAY = 2;
//        final int WEDNESDAY = 3;
//        final int THURSDAY = 4;
//        final int FRIDAY = 5;
//        final int SATURDAY = 6;
//        final int SUNDAY = 7;
//        boolean isHoliday = true;
//        int today = SUNDAY;
//        if((today==MONDAY||today==WEDNESDAY||today==FRIDAY)&&!isHoliday)
//        {    System.out.println("Iam teaching today");
//        }
//        else
//        {    System.out.println("Iam not teaching today");
//        }


        // this keyword demo


//        Counter c=new Counter();
//        c.increment();
//        c.show();

        //Demo for Code for Garbage Collection


//        int SIZE = 200;
//        StringBuffer s;
//        for (int i = 0; i < SIZE; i++){    }
//        System.out.println("Garbage Collection started explicitly.");
//        long time = System.currentTimeMillis();
//        System.gc();
//        System.out.println("It took " + (System.currentTimeMillis()-time) + " ms");

       // inheritance hierarchy of Rodent

//        Rodent r[ ]=new Rodent[3];
//        r[0]=new Mouse();
//        r[1]=new Gerbil();
//        r[2]=new Hamster();
//
//        r[0].eat();
//        r[1].eat();
//        r[1].eat();

        //public, hence all the methods in an interface are automatically public.


//        Class1 c=new Class1();
//        c.show();


        //program to display the properties of a file

//        File f = new File("d:/jp/streams","ece.xls");
//        System.out.println("File Name = "+f.getName());
//        System.out.println("Parent Name = "+f.getParent());
//        System.out.println("Full Path = "+f.getPath());
//        System.out.println("AbsolutePath ="+f.getAbsolutePath());
//        System.out.println("Is it a File: "+f.isFile());
//        System.out.println("Is it a Directory: "+f.isDirectory());
//        System.out.println("Length ="+f.length());
//        System.out.println("Is the File Exists ="+f.exists());



    }
}
