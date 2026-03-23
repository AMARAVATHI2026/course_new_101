package com.course.courseplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.course.courseplatform.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmailAndPassword(String email, String password);

}