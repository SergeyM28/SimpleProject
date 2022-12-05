package ru.gb.oseminar.data;

public class Student extends User {

    private Long studentID;

    public Student(String firstName, String lastName, String patronomyc, Long studentID) {
        super(firstName, lastName, patronomyc);
        this.studentID = studentID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }
}
