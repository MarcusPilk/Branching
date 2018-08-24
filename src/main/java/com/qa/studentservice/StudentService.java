package com.qa.studentservice;

import com.qa.students.Student;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentService {
    private Map<Integer,Student> studentMap;
    private int counter = 1;

    public StudentService() {
        studentMap = new HashMap<>();
    }

    public void addStudentToMap(Student studentToAdd){
        studentMap.put(counter,studentToAdd);
        counter++;
    }

    public Map<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public int numberOfFirstName(String searchName) {
        int counter = 0;
        for (int key:studentMap.keySet()) {
            if(studentMap.get(key).getFirstName().equals(searchName))counter++;
        }
        return counter;
    }
}
