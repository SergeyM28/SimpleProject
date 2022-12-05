package ru.gb.oseminar;

import ru.gb.oseminar.Controller.Controller;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createUser("Sergei", "Mikhailov", "Vladimirovich");
        controller.createUser("Maria", "Pechenkina", "Anatolievna");
        Student st1 = new Student("Sergei", "Mikhailov", "Vladimirovich", 1L);
        Student st2 = new Student("Maria", "Pechenkina", "Anatolievna", 2L);
        Teacher t1 = new Teacher("Ivan", "Petrov", "Stepanovich", 3L);
        ArrayList<Long> studentsID = new ArrayList<>();
        studentsID.add(1L);
        studentsID.add(2L);

        controller.createGroup(3L, studentsID);
    }
}