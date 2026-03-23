package com.course.courseplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.course.courseplatform.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long>{

}