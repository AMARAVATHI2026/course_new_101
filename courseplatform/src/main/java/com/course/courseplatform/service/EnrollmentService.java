package com.course.courseplatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.courseplatform.model.Enrollment;
import com.course.courseplatform.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment enrollCourse(Enrollment enrollment){
        return enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> getEnrollments(){
        return enrollmentRepository.findAll();
    }
}