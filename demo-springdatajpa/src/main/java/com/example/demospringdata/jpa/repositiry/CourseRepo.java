package com.example.demospringdata.jpa.repositiry;

import com.example.demospringdata.jpa.entity.Course;
import com.example.demospringdata.jpa.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
}
