package ru.gb.oseminar.data;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> liatOfStudents;

    public StudentGroup(Teacher teacher, List<Student> liatOfStudents) {
        this.teacher = teacher;
        this.liatOfStudents = liatOfStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getLiatOfStudents() {
        return liatOfStudents;
    }

    public void setLiatOfStudents(List<Student> liatOfStudents) {
        this.liatOfStudents = liatOfStudents;
    }

}
