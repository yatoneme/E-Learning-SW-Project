package com.elearning.www._1_4_json_entities;
// Generated Apr 26, 2025 12:43:05 PM by Hibernate Tools 4.3.1



/**
 * QuestionGrades generated by hbm2java
 */
public class QuestionGrades  implements java.io.Serializable {


     private QuestionGradesId id;
     private ExaminedOn examinedOn;
     private QuestionChoices questionChoices;
     private short grade;

    public QuestionGrades() {
    }

    public QuestionGrades(QuestionGradesId id, ExaminedOn examinedOn, QuestionChoices questionChoices, short grade) {
       this.id = id;
       this.examinedOn = examinedOn;
       this.questionChoices = questionChoices;
       this.grade = grade;
    }
   
    public QuestionGradesId getId() {
        return this.id;
    }
    
    public void setId(QuestionGradesId id) {
        this.id = id;
    }
    public ExaminedOn getExaminedOn() {
        return this.examinedOn;
    }
    
    public void setExaminedOn(ExaminedOn examinedOn) {
        this.examinedOn = examinedOn;
    }
    public QuestionChoices getQuestionChoices() {
        return this.questionChoices;
    }
    
    public void setQuestionChoices(QuestionChoices questionChoices) {
        this.questionChoices = questionChoices;
    }
    public short getGrade() {
        return this.grade;
    }
    
    public void setGrade(short grade) {
        this.grade = grade;
    }




}


