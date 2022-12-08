package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users){
        Logger logger = Logger.getAnonymousLogger();

        for (User user : users) {
            logger.info(user.toString());
        }
    }
    public void showStudents(List<Student> studentGroup){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (Student item : studentGroup){
            log.info(item.toString());
        }
    }
    public void showStudentsByGroup(Map<Student, Integer> sortedMapOfStudents, List<Student> sortedListOfStudents){
        Logger log = Logger.getAnonymousLogger();
        for (Student item : sortedListOfStudents){
            log.info(item.toString() + " Группа " + sortedMapOfStudents.get(item).toString());
        }
    }
}
