package Mocking;

import java.util.ArrayList;
import java.util.List;

public class GenerateFacePerson implements PersonSevice {


    @Override
    public List<Person> getAllPerson() {

        List <Person> personlist=new ArrayList<>();

        personlist.add(new Person(10,"somu","pune","5644655"));
        personlist.add(new Person(20,"somya","Mumbai","4644655"));
        personlist.add(new Person(30,"gomu","Hydrabad","3644655"));
        personlist.add(new Person(40,"gomya","Benguluru","2644655"));




        return personlist;
    }
}
