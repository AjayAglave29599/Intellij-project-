package Mocking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testPerson {

    @Test
    public void testPersonMock ()
    {
        PersonSevice personSevice=mock(PersonSevice.class);

        List <Person> personlist=new ArrayList<>();

        personlist.add(new Person(10,"somu","pune","5644655"));
        personlist.add(new Person(20,"somya","Mumbai","4644655"));
        personlist.add(new Person(30,"gomu","Hydrabad","3644655"));
        personlist.add(new Person(40,"gomya","Benguluru","2644655"));


        when(personSevice.getAllPerson()).thenReturn(personlist);
        Assert.assertEquals(20,personlist.get(1).getId());
    }
}
