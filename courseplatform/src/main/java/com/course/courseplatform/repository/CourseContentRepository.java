package com.course.courseplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.course.courseplatform.model.CourseContent;

public interface CourseContentRepository extends JpaRepository<CourseContent, Long>{

}