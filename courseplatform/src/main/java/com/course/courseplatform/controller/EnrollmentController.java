package com.course.courseplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.course.courseplatform.model.Enrollment;
import com.course.courseplatform.service.EnrollmentService;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public Enrollment enroll(@RequestBody Enrollment enrollment){
        return enrollmentService.enrollCourse(enrollment);
    }

    @GetMapping
    public List<Enrollment> getEnrollments(){
        return enrollmentService.getEnrollments();
    }
}