package com.g3appdev.ChickenProben.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.time.LocalTime;

@Entity
@Table(name = "Class")
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClassID")
    private int classId;

    @Column(name = "ClassName")
    private String className;

    @Column(name = "StartTime")
    private LocalTime startTime;

    @Column(name = "EndTime")
    private LocalTime endTime;

    @Column(name = "TeacherID")
    private int teacherId;
    
    public ClassEntity() {
        super();
    }

    public ClassEntity(int classId, String className, LocalTime startTime, LocalTime endTime, int teacherId) {
        super();
        this.classId = classId;
        this.className = className;
        this.startTime = startTime;
        this.endTime = endTime;
        this.teacherId = teacherId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    
    public int getTeacherId() {
        return teacherId;
    }
    
    public void setTeacher(int teacherId) {
        this.teacherId = teacherId;
    }
}
