public class DataStorage1 {

    private Book1[] books;
    private int size;

    public DataStorage1(int capacity) {
        books = new Book1[capacity];

    }

    public DataStorage1() {
        books=new Book1[16];

    }
    public void add (Book1 book){
        if(size==books.length){
            extend();
        }
        books [size++]=book;
    }

    private void extend() {
        Book1[]tmp=new Book1[books.length+10];
        System.arraycopy(books,0, tmp,0,books.length);
        books=tmp;
    }

    public void print(){
        for (int i = 0; i <size ; i++) {
            System.out.println(books[i]);

        }
    }


    public void search(String keyword) {
        boolean isFound=false;
        for (int i = 0; i <size ; i++) {
            if(books[i].getTitle().contains(keyword)){
                System.out.println(books[i]);
                isFound=true;

            }

        }
        if(!isFound){
            System.out.println("Ոչ մի գիրք չգտնվեց");
        }
    }

    private void deleteByIndex(int index){
        for(int i=index+1; i<size; i++){
            books[i-1]=books[i];
        }
        size--;
    }

    public void deleteByBookId(String bookId){
        for (int i = 0; i < size; i++) {
            if(books[i].getBookId().equals(bookId)){
                deleteByIndex(i);

            }

        }

    }
}
