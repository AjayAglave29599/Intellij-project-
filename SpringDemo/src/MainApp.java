import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext("springtest.xml");
        Book book_bean = (Book) classPathXmlApplicationContext.getBean("book_bean");
        Book book_bean1 = (Book) classPathXmlApplicationContext.getBean("book_bean_const");
        Book book_bean2 = (Book) classPathXmlApplicationContext.getBean("book_bean_mix");
        Book book_bean3 = (Book) classPathXmlApplicationContext.getBean("book_bean");
        Author book_bean_author = (Author) classPathXmlApplicationContext.getBean("book_bean_author");

        System.out.println(book_bean);
        System.out.println(book_bean1);
       System.out.println(book_bean2);
        System.out.println(book_bean3);
        System.out.println(book_bean_author);

        //System.out.println(book_bean.getTitle()+" "+book_bean.getPrice()+" "+book_bean.getIsbn());

    }
}
