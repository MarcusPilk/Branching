package com.qa.students;

public class Student {
    private String firstName;
    private String lastName;
    private int accountNumber;

    public Student(String firstName, String lastName, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;

    }
    
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }


}
