import java.util.Objects;

public class Author {
    private Integer authorID;
    private String name,country;
    private Book book_author;

    public Author() {
    }

    public Author(Integer authorID, String name, String country, Book book_author) {
        this.authorID = authorID;
        this.name = name;
        this.country = country;
        this.book_author = book_author;
    }

    public Integer getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Book getBook_author() {
        return book_author;
    }

    public void setBook_author(Book book_author) {
        this.book_author = book_author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorID, author.authorID) && Objects.equals(name, author.name) && Objects.equals(country, author.country) && Objects.equals(book_author, author.book_author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorID, name, country, book_author);
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorID=" + authorID +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", book_author=" + book_author +
                '}';
    }
}
