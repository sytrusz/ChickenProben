package com.g3appdev.ChickenProben.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "Teacher")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "TeacherID")
    private int teacherId;
    
    @Column(name = "Name")
    private String name;
    
    @Column(name = "Email")
    private String email;
    
    @Column(name = "Password")
    private String password;

    public TeacherEntity() {
        super();
    }

    public TeacherEntity(int teacherId, String name, String email, String password) {
        super();
        this.teacherId = teacherId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}