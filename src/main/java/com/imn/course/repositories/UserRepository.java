package com.imn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imn.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
