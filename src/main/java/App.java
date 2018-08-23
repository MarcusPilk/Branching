import com.qa.students.Student;
import com.qa.studentservice.StudentService;

public class App {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        studentService.addStudentToMap(new Student("Marcus","Pilkington"));
        studentService.addStudentToMap(new Student("Test","Student2"));
    }
}
