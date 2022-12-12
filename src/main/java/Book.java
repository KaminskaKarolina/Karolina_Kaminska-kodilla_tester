public class Book {
    private String author = "Isaac Asimov";
    private String tittle = "The Galaxy";

    public Book(String author, String tittle) {

        this.author = author;
        this.tittle = tittle;
    }

        public static Book of (String author, String tittle) {
            Book book = new Book("Isaac Asimov", "The Galaxy");
            return book;
        }

            public static void main (String[]args){
                Book book = Book.of("Isaac Asimov", "The Galaxy");
                System.out.println(book);
            }
        }


