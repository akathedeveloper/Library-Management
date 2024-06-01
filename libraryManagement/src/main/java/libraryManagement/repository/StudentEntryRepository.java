package libraryManagement.repository;

import libraryManagement.entity.StudentEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentEntryRepository extends MongoRepository<StudentEntry, ObjectId> {
}
