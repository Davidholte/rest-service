package com.repository;

import com.models.User;

import java.util.List;

public interface IUserRepository {

    List<User> getAllUsers();

    User getUser(int id);

    void createUser();

    void updateUser();

    void deleteUser(int id);
}
