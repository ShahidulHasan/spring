package com.user.module.controllers;

import com.user.module.entities.Users;
import com.user.module.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UsersService usersService;

    @RequestMapping("user-create")
    public ModelAndView userForm(@ModelAttribute Users users) {
        return new ModelAndView("user/form");
    }

    @RequestMapping("user-save")
    public ModelAndView userSave(@ModelAttribute Users users) {
        usersService.save(users);
        return new ModelAndView("redirect:list");
    }
}