package extract_class;

public class Book {
    private final String title;
    private final String isbn;
    private final String price;
    private final Author author;

    public Book(String title, String isbn, String price, String authorName, String authorMail) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        author = new Author(authorName, authorMail);
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPrice() {
        return price;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorMail() {
        return author.getMail();
    }

    public void setAuthorName(String name) {
        author.setName(name);
    }

    public void setAuthorMail(String mail) {
        author.setMail(mail);
    }

    public String toXml() {
        String authorXml =
                tag("author", tag("name", author.getName()) + tag("mail", author.getMail()));
        return tag("book", tag("title", title) + tag("isbn", isbn) + tag("price", price) + authorXml);
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }
    // ...
}
