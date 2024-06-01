package libraryManagement.service;

import libraryManagement.entity.StudentEntry;
import libraryManagement.repository.StudentEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentEntryService {
    @Autowired
    private StudentEntryRepository studentEntryRepository;

    public void saveEntry(StudentEntry studentEntry){
        studentEntryRepository.save(studentEntry);
    }

    public List<StudentEntry> getAll(){
        return studentEntryRepository.findAll();
    }

    public Optional<StudentEntry> findById(ObjectId id){
        return studentEntryRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        studentEntryRepository.deleteById(id);
    }
}
