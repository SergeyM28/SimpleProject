package ru.gb.oseminar.Controller;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.StudentGroupService;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentView;

import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    public void createUser(String firstName, String lastName, String patronomyc){
        userService.createUsers(firstName, lastName, patronomyc);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

    public StudentGroup createGroup (Long teacherID, List<Long> studentIDList){
        UserService us = new UserService();
        List<Student> studentsToAdd = null;
        List<User> allUsers = us.getAll();
        Teacher teacherToAdd = null;
        for (User item : allUsers){
            if (item instanceof Teacher){
                if (((Teacher) item).getTeacherID().equals(teacherID)){
                    teacherToAdd = (Teacher)item;
                }
            }
            else if (item instanceof Student){
                if (studentIDList.contains(((Student) item).getStudentID())){
                    studentsToAdd.add((Student)item);
                }
            }
        }
        StudentGroupService sgt = new StudentGroupService();
        StudentGroup studentGroup = sgt.FormGroup(teacherToAdd, studentsToAdd);
        return studentGroup;
    }

}
