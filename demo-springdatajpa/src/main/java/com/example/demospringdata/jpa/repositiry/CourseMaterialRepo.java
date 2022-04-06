package com.example.demospringdata.jpa.repositiry;

import com.example.demospringdata.jpa.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMaterialRepo extends JpaRepository<CourseMaterial,Long> {
    public List<CourseMaterial> findAll();
}
