package libraryManagement.service;

import libraryManagement.entity.BookEntry;
import libraryManagement.repository.BookEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookEntryService {
    @Autowired
    private BookEntryRepository bookEntryRepository;

    public void saveEntry(BookEntry bookEntry){
        bookEntryRepository.save(bookEntry);
    }

    public List<BookEntry> getAll(){
        return bookEntryRepository.findAll();
    }

    public Optional<BookEntry> findById(ObjectId id){
        return bookEntryRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        bookEntryRepository.deleteById(id);
    }
}
