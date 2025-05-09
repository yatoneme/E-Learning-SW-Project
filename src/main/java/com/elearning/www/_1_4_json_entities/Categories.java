package com.elearning.www._1_4_json_entities;
// Generated Apr 26, 2025 12:43:05 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categories generated by hbm2java
 */
public class Categories  implements java.io.Serializable {


     private byte categoryId;
     private String type;
     private String name;
     private Set students = new HashSet(0);
     private Set courses = new HashSet(0);

    public Categories() {
    }

	
    public Categories(byte categoryId, String type, String name) {
        this.categoryId = categoryId;
        this.type = type;
        this.name = name;
    }
    public Categories(byte categoryId, String type, String name, Set students, Set courses) {
       this.categoryId = categoryId;
       this.type = type;
       this.name = name;
       this.students = students;
       this.courses = courses;
    }
   
    public byte getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(byte categoryId) {
        this.categoryId = categoryId;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getStudents() {
        return this.students;
    }
    
    public void setStudents(Set students) {
        this.students = students;
    }
    public Set getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set courses) {
        this.courses = courses;
    }




}


