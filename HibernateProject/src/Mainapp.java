import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Mainapp {

    public static void main(String[] args) {

      // Session session=  HibernateUtil.getSessionFactory().openSession();

        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();


        /////////////

//        Criteria criteria = session.createCriteria(Laptop.class);
////Criteria id = criteria.add(Restrictions.eq("id", 1));
//        List<Person> list = criteria.list();
//        for (Person p:list) {
//            System.out.println(p);
//        }


        //////////////////////
//        Person person=new Person();
//        person.setId(10);
//        person.setName("Ajay");
//        person.setAddress("Mumbai");
//        person.setPhone("5534464");
//        session.save(person);


        //////////////////////////
        Laptop laptop=new Laptop();
        laptop.setCpu("i5");
     Employee employee=new Employee();
          employee.setActive(true);
          employee.setName("ajay");
          employee.setLaptop(laptop);

          List <ContactDetails> contactDetails=new ArrayList<>();
          ContactDetails contactDetails1=new ContactDetails(10l,"4556466","@gmail.com",ContenctType.BUSINESS);
          contactDetails.add(contactDetails1);
        ContactDetails contactDetails2=new ContactDetails(20l,"987456","@gmail.com",ContenctType.HOME);
        contactDetails.add(contactDetails2);
        ContactDetails contactDetails3=new ContactDetails(30l,"46972","@yahoo.com",ContenctType.OFFICE);
        contactDetails.add(contactDetails3);

          session.save(laptop);
          session.save(contactDetails1);
          session.save(contactDetails2);
          session.save(contactDetails3);
          session.save(employee);
        transaction.commit();
        session.close();           // Optional
        sessionFactory.close();   // Optional

        ////////




    }
}
