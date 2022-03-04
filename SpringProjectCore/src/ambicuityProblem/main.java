package ambicuityProblem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext("ambicuityProblem.config1.xml");

        Addition add = (Addition) classPathXmlApplicationContext.getBean("add");

        System.out.println(add);


    }

}
