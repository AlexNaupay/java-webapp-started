package com.devteam.project.services.impl;

import com.devteam.project.dao.UserDao;
import com.devteam.project.entities.User;
import com.devteam.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }
}
