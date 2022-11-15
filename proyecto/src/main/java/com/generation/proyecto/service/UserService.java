package com.generation.proyecto.service;

import java.util.List;

import com.generation.proyecto.model.User;


public interface UserService {
    List<User> getAll();

    void add(User user);

    void remove(User user);

    int size();

    User getUser(int position);
}
