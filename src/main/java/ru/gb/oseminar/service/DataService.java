package ru.gb.oseminar.service;

import ru.gb.oseminar.data.User;

import java.util.List;

public interface DataService {
    void createUsers(String firstName, String lastName, String patronomyc);
    List<User> getAll();
    void deleteUser(Long id);

}
