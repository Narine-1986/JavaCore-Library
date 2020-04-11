import java.util.Scanner;

public class LibraryMain {
    static DataStorage1 ds = new DataStorage1();
    static Scanner scanner = new Scanner(System.in);

    private static final int EXIT = 0;
    private static final int ADD = 1;
    private static final int SEARCH = 2;
    private static final int DELETE = 3;
    private static final int PRINT_ALL = 4;

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String commandStr=scanner.nextLine();
            int command = Integer.parseInt(commandStr);
            switch (command) {
                case EXIT:
                    isRun = false;
                    System.out.println("Հաջողություն");
                    break;
                case ADD:
                    addBook();
                    break;
                case SEARCH:
                   search();
                    break;
                case DELETE:
                   delete();
                    break;
                case PRINT_ALL:
                    ds.print();
                    break;
                default:
                    System.out.println("Սխալ հրաման");
            }
        }


    }

    private static void delete() {
        ds.print();
        System.out.println("Ներմուծել գրքի իդ-ն ջնջելու համար");
        String bookId=scanner.nextLine();
        ds.deleteByBookId(bookId);



    }

    private static void search() {
        System.out.println("Ներմուծել գրքի փնտրվող բառը");
        String keyword=scanner.nextLine();
        ds.search(keyword);


    }

    private static void addBook() {
        System.out.println("Ներմուծեք հեղինակի տվյալները(name, surname, email,gender)");
        String authorDataStr = scanner.nextLine();
        String[] authordata = authorDataStr.split(",");
        Author author = new Author();
        author.setName(authordata[0]);
        author.setSurname(authordata[1]);
        author.setEmail(authordata[2]);
        author.setGender(authordata[3]);

        System.out.println("Ներմուծեք գրքի տվյալները" + "(bookId, title, description, price, count)");

        String bookDataStr = scanner.nextLine();
        String[] bookData = bookDataStr.split(",");
        Book1 book = new Book1();
        book.setBookId(bookData[0]);
        book.setTitle(bookData[1]);
        book.setDescription(bookData[2]);
        book.setAuthor(author);
        book.setPrice(Double.parseDouble(bookData[3]));
        book.setCount(Integer.parseInt(bookData[4]));

        ds.add(book);
        System.out.println("գիրքը ավելացվեց");


    }


    private static void printCommands() {
        System.out.println("Ներմուծել " + EXIT + " դուրս գալու համար");
        System.out.println("Ներմուծել " + ADD + " գիրք ավելացնելու համար");
        System.out.println("Ներմուծել " + SEARCH + " գիրք փնտրելու համար");
        System.out.println("Ներմուծել " + DELETE + " գիրք ջնջելու համար");
        System.out.println("Ներմուծել " + PRINT_ALL + " բոլոր գրքերը տեսնելու համար");

    }
}
