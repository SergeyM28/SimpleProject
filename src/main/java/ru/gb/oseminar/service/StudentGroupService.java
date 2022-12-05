package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.List;

public class StudentGroupService {
    public StudentGroup FormGroup (Teacher teacher, List<Student> listOfStudents){
        StudentGroup tempGroup = new StudentGroup(teacher, listOfStudents);
        return tempGroup;
    }
}
