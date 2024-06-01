package libraryManagement.repository;

import libraryManagement.entity.BookEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookEntryRepository extends MongoRepository<BookEntry, ObjectId> {

}
