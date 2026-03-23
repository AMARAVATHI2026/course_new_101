package com.course.courseplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.course.courseplatform.model.Course;
import com.course.courseplatform.service.CourseService;

@Controller
public class PageController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/courses")
    public String coursesPage(Model model){

        List<Course> courses = courseService.getAllCourses();

        model.addAttribute("courses", courses);

        return "courses";
    }
}