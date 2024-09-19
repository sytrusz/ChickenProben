package com.g3appdev.ChickenProben.service;

import com.g3appdev.ChickenProben.entity.ClassEntity;
import com.g3appdev.ChickenProben.repository.ClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ClassService {

    @Autowired
    private ClassRepo classRepo;

    public ClassService() {
        super();
    }

    
    public ClassEntity saveClass(ClassEntity classEntity) {
        return classRepo.save(classEntity);
    }
    
    // Get all
    public List<ClassEntity> getAllClasses() {
        return classRepo.findAll();
    }

    // Get by ID
    public Optional<ClassEntity> getClassById(int classId) {
        return classRepo.findById(classId);
    }

    // Update
    @SuppressWarnings("finally")
    public ClassEntity updateClass(int id, ClassEntity updatedClass) {
        ClassEntity classEntity = new ClassEntity();

        try{
            classEntity = classRepo.findById(id).get();
            
            classEntity.setClassName(updatedClass.getClassName());
            classEntity.setStartTime(updatedClass.getStartTime());
            classEntity.setEndTime(updatedClass.getEndTime());
            //Teacher ID cannot be updated

        }catch(NoSuchElementException nex){
            throw new Exception ("Class " + id + " not found");
        }finally{
            return classRepo.save(classEntity);
        }
    }

    // Delete class by ID
    public String deleteClass(int id) {
        String msg = "";
        if (classRepo.findById(id)!=null){
            classRepo.deleteById(null);
            msg = "Class record successfully deleted!";
        }else
            msg = id + "NOT FOUND!";
        return msg;
    }
}
