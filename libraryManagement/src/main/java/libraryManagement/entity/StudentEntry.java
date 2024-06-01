package libraryManagement.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentEntries")
public class StudentEntry {

    @Id
    private ObjectId studentId;
    private String studentName;
    private String studentBranch;


    public ObjectId getStudentId() {
        return studentId;
    }

    public void setStudentId(ObjectId studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String branch) {
        this.studentBranch = branch;
    }
}
