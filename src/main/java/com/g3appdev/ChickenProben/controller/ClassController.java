package com.g3appdev.ChickenProben.controller;

import com.g3appdev.ChickenProben.entity.ClassEntity;
import com.g3appdev.ChickenProben.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    // Check
    @GetMapping("/print")
    public String print() {
        return "This is the Class Table. Hello!";
    }

    // Create
    @PostMapping("/save")
    public ResponseEntity<ClassEntity> saveClass(@RequestBody ClassEntity classEntity) {
        ClassEntity savedClass = classService.saveClass(classEntity);
        return ResponseEntity.ok(savedClass);
    }

    // Get all
    @GetMapping("/getAll")
    public ResponseEntity<List<ClassEntity>> getAllClasses() {
        List<ClassEntity> classes = classService.getAllClasses();
        return ResponseEntity.ok(classes);
    }

    // Update by ID
    @PutMapping("/update")
    public ClassEntity updateClass(@RequestParam int classId, @RequestBody ClassEntity classEntity) {
        return classService.updateClass(classId, classEntity);
    }

    // Delete by ID
    @DeleteMapping("/delete/{classId}")
    public String deleteClass(@PathVariable int classId){
        return classService.deleteClass(classId);
    }
}
