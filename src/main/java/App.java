import com.qa.students.Student;
        import com.qa.studentservice.StudentService;


public class App {
    public App() {
        StudentService studentService = new StudentService();

        studentService.addStudentToMap(new Student("Marcus","Pilkington",1234));
        studentService.addStudentToMap(new Student("Test","Student2",1234));


        for (int entry : studentService.getStudentMap().keySet()) {
            System.out.println(studentService.getStudentMap().get(entry).toString());
        }
    }



    public static void main(String[] args) {
        new App();
    }
}
