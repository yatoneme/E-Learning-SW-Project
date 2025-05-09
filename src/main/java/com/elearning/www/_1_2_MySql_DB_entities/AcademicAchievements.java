package com.elearning.www._1_2_MySql_DB_entities;
// Generated Apr 26, 2025 12:43:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AcademicAchievements generated by hbm2java
 */
@Entity
@Table(name="academic_achievements"
    ,catalog="elearning"
)
public class AcademicAchievements  implements java.io.Serializable {


     private AcademicAchievementsId id;
     private Achievements achievements;
     private Instructor instructor;

    public AcademicAchievements() {
    }

    public AcademicAchievements(AcademicAchievementsId id, Achievements achievements, Instructor instructor) {
       this.id = id;
       this.achievements = achievements;
       this.instructor = instructor;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="achievementId", column=@Column(name="achievement_id", nullable=false) ), 
        @AttributeOverride(name="instructorId", column=@Column(name="instructor_id", nullable=false) ), 
        @AttributeOverride(name="applicationId", column=@Column(name="application_id") ) } )
    public AcademicAchievementsId getId() {
        return this.id;
    }
    
    public void setId(AcademicAchievementsId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="achievement_id", nullable=false, insertable=false, updatable=false)
    public Achievements getAchievements() {
        return this.achievements;
    }
    
    public void setAchievements(Achievements achievements) {
        this.achievements = achievements;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="instructor_id", referencedColumnName="instructor_id", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="application_id", referencedColumnName="application_id", insertable=false, updatable=false) } )
    public Instructor getInstructor() {
        return this.instructor;
    }
    
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }




}


