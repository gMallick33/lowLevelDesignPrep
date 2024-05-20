import java.util.List;

public class Library implements IAggregator{
    List<Book> bookList;
    Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public IIterator createIterator() {
        return new BookIterator(bookList);
    }
}
