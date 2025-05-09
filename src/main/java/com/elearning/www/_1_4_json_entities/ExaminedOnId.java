package com.elearning.www._1_4_json_entities;
// Generated Apr 26, 2025 12:43:05 PM by Hibernate Tools 4.3.1



/**
 * ExaminedOnId generated by hbm2java
 */
public class ExaminedOnId  implements java.io.Serializable {


     private byte attemptNo;
     private int sectionId;
     private int studentId;

    public ExaminedOnId() {
    }

    public ExaminedOnId(byte attemptNo, int sectionId, int studentId) {
       this.attemptNo = attemptNo;
       this.sectionId = sectionId;
       this.studentId = studentId;
    }
   
    public byte getAttemptNo() {
        return this.attemptNo;
    }
    
    public void setAttemptNo(byte attemptNo) {
        this.attemptNo = attemptNo;
    }
    public int getSectionId() {
        return this.sectionId;
    }
    
    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ExaminedOnId) ) return false;
		 ExaminedOnId castOther = ( ExaminedOnId ) other; 
         
		 return (this.getAttemptNo()==castOther.getAttemptNo())
 && (this.getSectionId()==castOther.getSectionId())
 && (this.getStudentId()==castOther.getStudentId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getAttemptNo();
         result = 37 * result + this.getSectionId();
         result = 37 * result + this.getStudentId();
         return result;
   }   


}


