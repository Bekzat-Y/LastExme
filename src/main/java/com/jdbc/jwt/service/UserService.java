package com.jdbc.jwt.service;

import com.jdbc.jwt.entity.Role;
import com.jdbc.jwt.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}