package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        List <String> list = new ArrayList();
//
//        String [] number={"1","2","3","4"};
//        for (int i=0; i<number.length; i++)
//        {
//            list.add(number[i]);
//        }
//
//
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        list.add("five");
//
//        Iterator iterator = list.iterator();
//        System.out.println("Iterating using Iterator");
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        System.out.println("Enhanced For Loop");
//        for(Object ob:list)
//        {
//            System.out.println(list);
//        }
//        System.out.println("Regular For Loop");
//        for(int i=0; i< list.size(); i++)
//        {
//            System.out.println(list.get(i));
//        }
//        System.out.println("converting to the string");
//        list.remove(2);
//        list.remove("four");
//        System.out.println(list);


        // Iterator

//        List <String> namelist=new ArrayList<String>();
//
//        String [] string={"somya", "gomya", "somu", "gomu"};
//
//        for (int i=0; i<string.length; i++)
//        {
//            namelist.add(string[i]);
//        }
//
//        Iterator<String> ito= namelist.iterator();
//
//        while (ito.hasNext())
//        {
//            System.out.println(ito.next());
//        }

        //

        List<String> nameList = new ArrayList<String>();
        String [] names = {"Ann", "Bob", "Carol"};
        // Add to arrayList using a ListIterator
        ListIterator<String> it = nameList.listIterator();
        for (int k = 0; k < names.length; k++)
            nameList.add(names[k]);
         // ListIterator it = nameList.listIterator();


         while (it.hasNext()) {
             System.out.println(it.next());
         }

    }
}
