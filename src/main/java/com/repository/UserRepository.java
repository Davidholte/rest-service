package com.repository;

import com.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {

    public List<User> getAllUsers() {

        List<User> users = new ArrayList<User>();

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    public User getUser(int id) {

        User user = new User();

        return user;
    }

    public void createUser() {

    }

    public void updateUser() {

    }

    public void deleteUser(int id) {

    }
}
