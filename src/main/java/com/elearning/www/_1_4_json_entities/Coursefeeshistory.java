package com.elearning.www._1_4_json_entities;
// Generated Apr 26, 2025 12:43:05 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Coursefeeshistory generated by hbm2java
 */
public class Coursefeeshistory  implements java.io.Serializable {


     private CoursefeeshistoryId id;
     private Course course;
     private BigDecimal fees;

    public Coursefeeshistory() {
    }

	
    public Coursefeeshistory(CoursefeeshistoryId id, Course course) {
        this.id = id;
        this.course = course;
    }
    public Coursefeeshistory(CoursefeeshistoryId id, Course course, BigDecimal fees) {
       this.id = id;
       this.course = course;
       this.fees = fees;
    }
   
    public CoursefeeshistoryId getId() {
        return this.id;
    }
    
    public void setId(CoursefeeshistoryId id) {
        this.id = id;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public BigDecimal getFees() {
        return this.fees;
    }
    
    public void setFees(BigDecimal fees) {
        this.fees = fees;
    }




}


