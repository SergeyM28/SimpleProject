package ru.gb.oseminar.data;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> listOfStudents;

    public StudentGroup(Teacher teacher, List<Student> liatOfStudents) {
        this.teacher = teacher;
        this.listOfStudents = liatOfStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

}
