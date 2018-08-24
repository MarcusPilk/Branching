package com.qa.studentservice;

import com.qa.students.Student;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    public int numberOfFirstName(final String searchName) {
        return studentMap.values().stream().filter(student -> searchName.equals(student.getFirstName())).collect(Collectors.counting()).intValue();
    }
}
