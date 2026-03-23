package com.course.courseplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.course.courseplatform.model.CourseContent;
import com.course.courseplatform.service.CourseContentService;

@RestController
@RequestMapping("/content")
public class CourseContentController {

    @Autowired
    private CourseContentService service;

    @PostMapping
    public CourseContent addContent(@RequestBody CourseContent content){
        return service.addContent(content);
    }

    @GetMapping
    public List<CourseContent> getContent(){
        return service.getContents();
    }
}