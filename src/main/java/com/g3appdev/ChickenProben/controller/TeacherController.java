package com.g3appdev.ChickenProben.controller;

import com.g3appdev.ChickenProben.entity.TeacherEntity;
import com.g3appdev.ChickenProben.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    // Check
    @GetMapping("/print")
    public String print() {
        return "Hello, Teacher! Test";
    }

    // Create
    @PostMapping("/save")
    public TeacherEntity saveTeacher(@RequestBody TeacherEntity teacher) {
        return teacherService.saveTeacher(teacher);
    }

    // Get all
    @GetMapping("/getAll")
    public List<TeacherEntity> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    // Update by ID
    @PutMapping("/update")
    public TeacherEntity updateTeacher(@RequestParam int teacherId, @RequestBody TeacherEntity teacher) {
        return teacherService.updateTeacher(teacherId, teacher);
    }

    // Delete by ID
    @DeleteMapping("/delete/{teacherId}")
    public String deleteTeacher(@PathVariable int teacherId){
        return teacherService.deleteTeacher(teacherId);
    }
}