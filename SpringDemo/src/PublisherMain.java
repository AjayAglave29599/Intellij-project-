import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PublisherMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext("springtest.xml");
        Publisher pub = (Publisher) classPathXmlApplicationContext.getBean("pub");

        System.out.println(pub);
        classPathXmlApplicationContext.close();

    }





}
