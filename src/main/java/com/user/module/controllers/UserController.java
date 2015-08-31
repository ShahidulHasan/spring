package com.user.module.controllers;

import com.user.module.entities.Users;
import com.user.module.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
        return new ModelAndView("redirect:user-list");
    }

    @RequestMapping("user-list")
    public ModelAndView getList() {
        List users = usersService.list();
        return new ModelAndView("user/list","users",users);
    }

//    @RequestMapping("user-edit")
//    public ModelAndView editUser(@RequestParam String username,@ModelAttribute Users users) {
//        Users user = usersService.user(username);
//        return new ModelAndView("user/form","users",user);
//    }
}
