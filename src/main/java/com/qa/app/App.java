package com.qa.app;

import com.qa.students.Student;
        import com.qa.studentservice.StudentService;


public class App {
    private StudentService studentService;
    private App() {
        studentService = new StudentService();

        studentService.addStudentToMap(new Student("Marcus","Pilkington",1234));
        studentService.addStudentToMap(new Student("Test","Student2",1234));
    }



    public static void main(String[] args) {
        App app = new App();
        for (int entry : app.studentService.getStudentMap().keySet()) {
            System.out.println(app.studentService.getStudentMap().get(entry).toString());
        }
    }
}
