package com.course.courseplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.course.courseplatform.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}