package com.devteam.project.dao.impl;

import com.devteam.project.dao.UserDao;
import com.devteam.project.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public User findById(int id) {
        User user = new User();
        user.setFirstName("Kimberly");
        user.setLastName("Iglesias");
        user.setAge(20);
        return user;
    }
}
