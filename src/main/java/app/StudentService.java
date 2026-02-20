package app;
import java.*;

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