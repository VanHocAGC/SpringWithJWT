package com.carmanager.carapp.service;

import com.carmanager.carapp.domain.Role;
import com.carmanager.carapp.domain.User;

import java.util.List;

public interface UserService {
    User getUser(String username);
    List<User> getUsers();
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
}
