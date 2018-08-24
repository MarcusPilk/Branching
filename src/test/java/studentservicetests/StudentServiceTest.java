package studentservicetests;

import com.qa.students.Student;
import com.qa.studentservice.StudentService;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StudentServiceTest {
    private StudentService studentService;
    private Map<Integer,Student> studentMap;

    @Before
    public void setUp(){
        studentService = new StudentService();

        studentService.addStudentToMap(new Student("Marcus","Pilkington",1234));
        studentService.addStudentToMap(new Student("Marcus","Pilqueenton",1235));
        studentService.addStudentToMap(new Student("John","Frank",1236));
        studentService.addStudentToMap(new Student("Dave","Smith",1237));
        studentService.addStudentToMap(new Student("Marcus","Pilprinceton",1238));

        studentMap = studentService.getStudentMap();
    }

    @Test
    public void numberOfFirstNameTest(){
        assertEquals(3,studentService.numberOfFirstName("Marcus"));
    }
}
