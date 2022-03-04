public class TightCoupling {

    public static void main(String[] args) {
        Author author = new Author();
        Book book = new Book();
        System.out.println(author);
        author.setBook_author(book); // tight coupling


    }


}
