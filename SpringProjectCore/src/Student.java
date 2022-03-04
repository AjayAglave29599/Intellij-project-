import java.util.Objects;

public class Student {

    private int studentId;
    private String studentname;
    private String studntAdress;

    public Student(int studentId, String studentname, String studntAdress) {
        this.studentId = studentId;
        this.studentname = studentname;
        this.studntAdress = studntAdress;
    }

    public Student(String studntAdress) {
        this.studntAdress = studntAdress;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudntAdress() {
        return studntAdress;
    }

    public void setStudntAdress(String studntAdress) {
        this.studntAdress = studntAdress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(studentname, student.studentname) && Objects.equals(studntAdress, student.studntAdress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentname, studntAdress);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentname='" + studentname + '\'' +
                ", studntAdress='" + studntAdress + '\'' +
                '}';
    }
}
