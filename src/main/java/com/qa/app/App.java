package com.qa.app;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.qa.jsonConverter.ConvertToJson;
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
        System.out.println(ConvertToJson.toJson(app.studentService.getStudentMap()));

    }
}
