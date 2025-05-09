package com.elearning.www._1_2_MySql_DB_entities;
// Generated Apr 26, 2025 12:43:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * InstructorId generated by hbm2java
 */
@Embeddable
public class InstructorId  implements java.io.Serializable {


     private int instructorId;
     private int applicationId;

    public InstructorId() {
    }

    public InstructorId(int instructorId, int applicationId) {
       this.instructorId = instructorId;
       this.applicationId = applicationId;
    }
   


    @Column(name="instructor_id", unique=true, nullable=false)
    public int getInstructorId() {
        return this.instructorId;
    }
    
    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }


    @Column(name="application_id", nullable=false)
    public int getApplicationId() {
        return this.applicationId;
    }
    
    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InstructorId) ) return false;
		 InstructorId castOther = ( InstructorId ) other; 
         
		 return (this.getInstructorId()==castOther.getInstructorId())
 && (this.getApplicationId()==castOther.getApplicationId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getInstructorId();
         result = 37 * result + this.getApplicationId();
         return result;
   }   


}


