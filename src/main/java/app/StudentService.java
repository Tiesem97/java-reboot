package app;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent (Student student){
        students.add(student);
    }

    public boolean removeStudentById(int id){
        return students.removeIf(s -> s.getId()== id);
    }

    public List<Student> getAllStudents() {
        return students;
    }
}