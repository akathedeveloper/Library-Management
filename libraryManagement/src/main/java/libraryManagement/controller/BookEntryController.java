package libraryManagement.controller;

import libraryManagement.entity.BookEntry;
import libraryManagement.service.BookEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookEntryController {

    @Autowired
    private BookEntryService bookEntryService;

    @GetMapping
    public List<BookEntry> getAll(){
        return bookEntryService.getAll();
    }

    @GetMapping("/{bookId}")
    public BookEntry getBookById(@PathVariable ObjectId bookId){
        return bookEntryService.findById(bookId).orElse(null);
    }

    @PostMapping
    public BookEntry createBookEntry(@RequestBody BookEntry bookEntry){
        bookEntryService.saveEntry(bookEntry);
        return bookEntry;
    }

    @DeleteMapping("/{bookId}")
    public boolean deleteBookEntryById(@PathVariable("bookId") ObjectId bookId) {
        bookEntryService.deleteById(bookId);
        return true;
    }

    @PutMapping("/{bookId}")
    public BookEntry updateBookById(@PathVariable("bookId") ObjectId bookId, @RequestBody BookEntry newEntry) {
        BookEntry old = bookEntryService.findById(bookId).orElse(null);
        if (old != null) {
            old.setBookName(newEntry.getBookName() != null && !newEntry.getBookName().equals("") ? newEntry.getBookName() : old.getBookName());
            old.setBookAuthor(newEntry.getBookAuthor() != null && !newEntry.getBookAuthor().equals("") ? newEntry.getBookAuthor() : old.getBookAuthor());
            old.setBookGenre(newEntry.getBookGenre() != null && !newEntry.getBookGenre().equals("") ? newEntry.getBookGenre() : old.getBookGenre());
            bookEntryService.saveEntry(old);
        }
        return old;
    }

}
