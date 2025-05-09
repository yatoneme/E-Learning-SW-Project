package com.elearning.www._1_2_MySql_DB_entities;
// Generated Apr 26, 2025 12:43:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name="student"
    ,catalog="elearning"
    , uniqueConstraints = @UniqueConstraint(columnNames="student_email") 
)
public class Student  implements java.io.Serializable {


     private int studentId;
     private String studentEmail;
     private String firstName;
     private String middleName;
     private String lastName;
     private String country;
     private Date birthdate;
     private String gender;
     private byte accountStatus;
     private String password;
     private Integer currentPoints;
     private Set<Enrollment> enrollments = new HashSet<Enrollment>(0);
     private Set<Categories> categorieses = new HashSet<Categories>(0);
     private Set<ExaminedOn> examinedOns = new HashSet<ExaminedOn>(0);

    public Student() {
    }

	
    public Student(int studentId, String studentEmail, String firstName, String middleName, String lastName, String country, Date birthdate, String gender, byte accountStatus, String password) {
        this.studentId = studentId;
        this.studentEmail = studentEmail;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.country = country;
        this.birthdate = birthdate;
        this.gender = gender;
        this.accountStatus = accountStatus;
        this.password = password;
    }
    public Student(int studentId, String studentEmail, String firstName, String middleName, String lastName, String country, Date birthdate, String gender, byte accountStatus, String password, Integer currentPoints, Set<Enrollment> enrollments, Set<Categories> categorieses, Set<ExaminedOn> examinedOns) {
       this.studentId = studentId;
       this.studentEmail = studentEmail;
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.country = country;
       this.birthdate = birthdate;
       this.gender = gender;
       this.accountStatus = accountStatus;
       this.password = password;
       this.currentPoints = currentPoints;
       this.enrollments = enrollments;
       this.categorieses = categorieses;
       this.examinedOns = examinedOns;
    }
   
     @Id 

    
    @Column(name="student_id", unique=true, nullable=false)
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    
    @Column(name="student_email", unique=true, nullable=false, length=120)
    public String getStudentEmail() {
        return this.studentEmail;
    }
    
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    
    @Column(name="first_name", nullable=false)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="middle_name", nullable=false)
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    
    @Column(name="last_name", nullable=false)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="country", nullable=false)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="birthdate", nullable=false, length=10)
    public Date getBirthdate() {
        return this.birthdate;
    }
    
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    
    @Column(name="gender", nullable=false, length=6)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @Column(name="account_status", nullable=false)
    public byte getAccountStatus() {
        return this.accountStatus;
    }
    
    public void setAccountStatus(byte accountStatus) {
        this.accountStatus = accountStatus;
    }

    
    @Column(name="password", nullable=false, length=20)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="current_points")
    public Integer getCurrentPoints() {
        return this.currentPoints;
    }
    
    public void setCurrentPoints(Integer currentPoints) {
        this.currentPoints = currentPoints;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="student")
    public Set<Enrollment> getEnrollments() {
        return this.enrollments;
    }
    
    public void setEnrollments(Set<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="students")
    public Set<Categories> getCategorieses() {
        return this.categorieses;
    }
    
    public void setCategorieses(Set<Categories> categorieses) {
        this.categorieses = categorieses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="student")
    public Set<ExaminedOn> getExaminedOns() {
        return this.examinedOns;
    }
    
    public void setExaminedOns(Set<ExaminedOn> examinedOns) {
        this.examinedOns = examinedOns;
    }




}


