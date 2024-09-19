package com.g3appdev.ChickenProben.repository;

import com.g3appdev.ChickenProben.entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepo extends JpaRepository<ClassEntity, Integer> {

}