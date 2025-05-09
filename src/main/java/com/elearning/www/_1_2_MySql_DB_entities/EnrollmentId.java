package com.elearning.www._1_2_MySql_DB_entities;
// Generated Apr 26, 2025 12:43:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnrollmentId generated by hbm2java
 */
@Embeddable
public class EnrollmentId  implements java.io.Serializable {


     private int courseId;
     private int studentId;

    public EnrollmentId() {
    }

    public EnrollmentId(int courseId, int studentId) {
       this.courseId = courseId;
       this.studentId = studentId;
    }
   


    @Column(name="course_id", nullable=false)
    public int getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }


    @Column(name="student_id", nullable=false)
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EnrollmentId) ) return false;
		 EnrollmentId castOther = ( EnrollmentId ) other; 
         
		 return (this.getCourseId()==castOther.getCourseId())
 && (this.getStudentId()==castOther.getStudentId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCourseId();
         result = 37 * result + this.getStudentId();
         return result;
   }   


}


