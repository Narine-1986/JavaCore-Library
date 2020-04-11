public class DynamicArrayForBook extends Book {

    public Book[] books = new Book[3];
    int size = 0;

    

    void add(Book value) {
        value=new Book();
        if (size == books.length) {
            extend();
        }
        books[size++] = value;
    }


    private void extend() {
        Book[] dynbook = new Book[books.length + 10];
        for (int i = 0; i < books.length; i++) {
            dynbook[i] = books[i];
        }
        books = dynbook;
    }


    public Book getBookByTitle(String title) {
        for (int i=0; i<=size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }


        }
        return null;
    }




    }



