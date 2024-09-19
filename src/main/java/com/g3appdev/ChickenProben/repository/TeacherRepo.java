package com.g3appdev.ChickenProben.repository;

import com.g3appdev.ChickenProben.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherEntity, Integer> {

}