package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import java.lang.module.Configuration;

public class MainApp
{
    public static void main(String[] args) {
        SessionFactory fact= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=fact.openSession();
        Transaction transaction=session.beginTransaction();
        Student s=new Student();
        s.setName("ajay");
        session.save(s);
        transaction.commit();

    }
}
