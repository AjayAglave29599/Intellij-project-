package Mocking;

import java.util.ArrayList;
import java.util.List;

public class BusinessMan {

    private  PersonSevice personSevice;

    public BusinessMan(PersonSevice personSevice)
    {
        this.personSevice = personSevice;
    }
    public List<Person> findAllPerson(Person person)
    {
        List <Person> people=new ArrayList<>();
        people.add(person);
        return people;
    }
}
