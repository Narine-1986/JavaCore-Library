public class Book1 {
    private  String bookId;
    private String title;
    private String description;
    private Author author;
    private double price;
    private int count;

    public Book1(String bookId, String title, String description, Author author, double price, int count) {
        this.bookId = bookId;
        this.title = title;
        this.description = description;
        this.author = author;
        this.price = price;
        this.count = count;
    }

    public Book1() {
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book1 book1 = (Book1) o;

        if (Double.compare(book1.price, price) != 0) return false;
        if (count != book1.count) return false;
        if (bookId != null ? !bookId.equals(book1.bookId) : book1.bookId != null) return false;
        if (title != null ? !title.equals(book1.title) : book1.title != null) return false;
        if (description != null ? !description.equals(book1.description) : book1.description != null) return false;
        return author != null ? author.equals(book1.author) : book1.author == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + count;
        return result;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
