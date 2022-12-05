package ru.gb.oseminar.data;

public class Teacher extends User{

    private Long teacherID;

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    public Teacher(String firstName, String lastName, String patronomyc, Long teacherID) {
        super(firstName, lastName, patronomyc);
        this.teacherID = teacherID;


    }
}
