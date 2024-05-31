package libraryManagement.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentEntries")
public class StudentEntry {

    @Id
    private String studentId;
    private String studentName;
    private String studentBranch;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBranch() {
        return studentBranch;
    }

    public void setBranch(String branch) {
        this.studentBranch = branch;
    }
}
