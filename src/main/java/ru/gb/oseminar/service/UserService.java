package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUsers(String firstName,
                            String lastName,
                            String patronomyc) {
        Long id = 0L;
        for (User item : this.users){
            if (item instanceof Student){
                if (id < ((Student) item).getStudentID()) {
                    id = ((Student) item).getStudentID();
                }
            }
        }
        this.users.add(new Student(firstName, lastName, patronomyc, id));
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User item : this.users){
            if (item instanceof Student){
                if (id.equals(((Student) item).getStudentID())){
                    this.users.remove(item);
                }
            }
        }


    }
}
