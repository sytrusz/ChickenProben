package com.g3appdev.ChickenProben.service;

import com.g3appdev.ChickenProben.entity.TeacherEntity;
import com.g3appdev.ChickenProben.repository.TeacherRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    public TeacherService() {
        super();
    }

    // Create
    public TeacherEntity saveTeacher(TeacherEntity teacher) {
        return teacherRepo.save(teacher);
    }

    // Get all
    public List<TeacherEntity> getAllTeachers() {
        return teacherRepo.findAll();
    }

    // Get by ID
    public Optional<TeacherEntity> getTeacherById(int id) {
        return teacherRepo.findById(id);
    }

    // Update by ID
    @SuppressWarnings("finally")
    public TeacherEntity updateTeacher(int id, TeacherEntity updatedTeacher) {
        TeacherEntity teacherEntity = new TeacherEntity();

        try{
            teacherEntity = teacherRepo.findById(id).get();
            
            teacherEntity.setName(updatedTeacher.getName());
            teacherEntity.setEmail(updatedTeacher.getEmail());
            teacherEntity.setPassword(updatedTeacher.getPassword());
        }catch(NoSuchElementException nex){
            throw new Exception ("Teacher " + id + " not found");
        }finally{
            return teacherRepo.save(teacherEntity);
        }
    }

    // Delete by ID
    public String deleteTeacher(int id) {
        String msg = " ";
        if (teacherRepo.findById(id)!=null){
            teacherRepo.deleteById(id);
            msg = "Teacher record successfully deleted!";
        }else
            msg = id + "NOT FOUND!";
        return msg;
    }
}