package Exercise9Classes_Objects;

class Book {

    /* Static Variable */
    static int totalBooks;

    /* Instance Variable or Non-Static Variable */
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    /* Constructor */
    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    /* Chaining */
    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
    }

    /* Static Method */
    static int getTotalBooks(){
        return totalBooks;
    }

    /* Instance Methods */
    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("You can borrow " + title);
        }
    }

     void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false  ;
            System.out.println("Hope you enjoyed the book, please give us review");
        }else {
            System.out.println("Book is already in library ");
        }
    }

    public static void main(String[] args) {
        Book steveJob = new Book("1", "Steve Jobs", "Walter");
        Book elonMusk = new Book("2", "Elon Musk"  , "Walter");

        System.out.println(Book.getTotalBooks());

        steveJob.borrowBook();
        elonMusk.borrowBook();

        steveJob.borrowBook();
        steveJob.returnBook();
        steveJob.returnBook();
    }
}
