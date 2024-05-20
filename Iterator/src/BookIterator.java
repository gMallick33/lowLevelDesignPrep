import java.util.List;

public class BookIterator implements IIterator{
    List<Book> bookList;
    BookIterator(List<Book> bookList) {
        this.bookList = bookList;
    }

    int index = 0;

    @Override
    public boolean hasNext() {
        return index < bookList.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()) {
            return bookList.get(index++);
        }
        return null;
    }
}
