package libraryManagement.controller;

import libraryManagement.entity.StudentEntry;
import libraryManagement.service.StudentEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentEntryController {

    @Autowired
    private StudentEntryService studentEntryService;

    @GetMapping
    public List<StudentEntry> getAll(){
        return studentEntryService.getAll();
    }

    @GetMapping("/{studentId}")
    public StudentEntry getStudentById(@PathVariable ObjectId studentId){
        return studentEntryService.findById(studentId).orElse(null);
    }

    @PostMapping
    public StudentEntry createStudentEntry(@RequestBody StudentEntry studentEntry){
        studentEntryService.saveEntry(studentEntry);
        return studentEntry;
    }

    @DeleteMapping("/{studentId}")
    public boolean deleteStudentEntryById(@PathVariable ObjectId studentId) {
        studentEntryService.deleteById(studentId);
        return true;
    }

    @PutMapping("/{studentId}")
    public StudentEntry updateStudentById(@PathVariable ObjectId studentId, @RequestBody StudentEntry newEntry) {
        StudentEntry old = studentEntryService.findById(studentId).orElse(null);
        if (old != null) {
            old.setStudentName(newEntry.getStudentName() != null && !newEntry.getStudentName().equals("") ? newEntry.getStudentName() : old.getStudentName());
            old.setStudentBranch(newEntry.getStudentBranch() != null && !newEntry.getStudentBranch().equals("") ? newEntry.getStudentBranch() : old.getStudentBranch());
            studentEntryService.saveEntry(old);
        }
        return old;
    }

}
