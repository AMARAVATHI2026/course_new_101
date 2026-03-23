package com.course.courseplatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.courseplatform.model.CourseContent;
import com.course.courseplatform.repository.CourseContentRepository;

@Service
public class CourseContentService {

    @Autowired
    private CourseContentRepository repository;

    public CourseContent addContent(CourseContent content){
        return repository.save(content);
    }

    public List<CourseContent> getContents(){
        return repository.findAll();
    }
}