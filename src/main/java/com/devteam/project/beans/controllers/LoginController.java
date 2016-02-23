package com.devteam.project.beans.controllers;

import com.devteam.project.beans.models.UserModel;
import com.devteam.project.entities.User;
import com.devteam.project.services.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class LoginController {

    @ManagedProperty(value = "#{userModel}")
    private UserModel userModel;

    @ManagedProperty(value = "#{userService}")
    private UserService userService;

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void send(){
        User user = this.userService.findById(1);

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());

        System.out.println(this.userModel.getUsername());
    }

}
