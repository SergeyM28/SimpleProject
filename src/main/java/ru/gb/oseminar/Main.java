package ru.gb.oseminar;

import ru.gb.oseminar.Controller.Controller;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
//        controller.createUser("Sergei", "Mikhailov", "Vladimirovich");
//        controller.createUser("Maria", "Pechenkina", "Anatolievna");
        Student st1 = new Student("Sergei", "Mikhailov", "Vladimirovich", 1L);
        Student st2 = new Student("Maria", "Pechenkina", "Anatolievna", 2L);
        Student st3 = new Student("Konstantin", "Novikov", "Ivanovich", 3L);
        Student st4 = new Student("Anton", "Antonov", "Sergeevich", 4L);
        Student st5 = new Student("Matilda", "Fikusova", "Leonovna", 5L);
        Student st6 = new Student("Tony", "Stark", "Georgievich", 6L);
        Teacher t1 = new Teacher("Ivan", "Petrov", "Stepanovich", 100L);

        ArrayList<Student>studentGroup1 = new ArrayList<>(Arrays.asList(st1, st2, st3));
        ArrayList<Student>studentGroup2 = new ArrayList<>(Arrays.asList(st4, st5, st6));
        Map<Student, Integer> allStudentsMap = new HashMap<>();

        Map<Student, Integer> firstStudentMap = controller.formMapOfStudentsByGroup(allStudentsMap, studentGroup1, 1);
        Map<Student, Integer> resultStudentMap = controller.formMapOfStudentsByGroup(firstStudentMap, studentGroup2, 2);

        controller.showSortStudentsByGroup(resultStudentMap);
    }
}