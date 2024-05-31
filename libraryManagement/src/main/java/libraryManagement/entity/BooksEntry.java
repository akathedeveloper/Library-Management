package libraryManagement.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookEntries")
public class BooksEntry {
    @Id
    private String bookId;
    private String bookName;
    private String bookAuthor;

    public String getId() {
        return bookId;
    }

    public void setId(String id) {
        this.bookId = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
