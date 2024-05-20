import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("DSA", 100));
        bookList.add(new Book("System Design", 140));
        bookList.add(new Book("Database", 200));

        Library library = new Library(bookList);
        IIterator iterator = library.createIterator();
        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.name);
            System.out.println(book.price);
            System.out.println("next Book");
        }
    }
}