import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main (String [] args)
    {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("config.xml");

        Student student_bean = (Student) classPathXmlApplicationContext.getBean("Student_bean");
        Student student_bean1 = (Student) classPathXmlApplicationContext.getBean("Student_bean_const");
        Student student_bean2 = (Student) classPathXmlApplicationContext.getBean("Student_bean_mix");

        System.out.println(student_bean);
        System.out.println(student_bean1);
        System.out.println(student_bean2);
    }
}
