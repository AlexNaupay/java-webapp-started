package com.devteam.project.services;

import com.devteam.project.entities.User;

public interface UserService {
    /**
     * Find User by id
     * @param id user id
     * @return User with id=id
     */
    User findById(int id);
}
