public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static String of(String author, String title) {
        Book book = new Book(author, title);
        return author;
        return title;
    }
    public static void main(String[]args) {
        Book book = new Book ("Isaac Asimov", "The Galaxy");
                System.out.println(book.author);
        System.out.println(book.title);
    }
}
