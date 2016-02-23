package com.devteam.project.dao;

import com.devteam.project.entities.User;

public interface UserDao {

    User findById(int id);
}
