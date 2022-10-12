package com.jeff.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeff.crudspring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
