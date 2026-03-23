package com.course.courseplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.course.courseplatform.model.User;
import com.course.courseplatform.service.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute User user, Model model){

        User existingUser = userService.login(user.getEmail(), user.getPassword());

        if(existingUser != null){
            return "redirect:/courses";
        } else {
            model.addAttribute("error","Invalid Email or Password");
            return "login";
        }
    }
}