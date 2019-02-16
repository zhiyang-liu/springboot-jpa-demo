package com.lianjia.jpa.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "class_id")
    private int classId;
    @Column(name = "aaa")
    private int aaa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getAaa() {
        return aaa;
    }

    public void setAaa(int aaa) {
        this.aaa = aaa;
    }
}
