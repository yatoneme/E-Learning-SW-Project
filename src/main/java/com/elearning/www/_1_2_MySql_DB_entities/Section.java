package com.elearning.www._1_2_MySql_DB_entities;
// Generated Apr 26, 2025 12:43:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Section generated by hbm2java
 */
@Entity
@Table(name="section"
    ,catalog="elearning"
)
public class Section  implements java.io.Serializable {


     private int sectionId;
     private Module module;
     private byte sectionIndex;
     private String title;
     private Set<ExaminedOn> examinedOns = new HashSet<ExaminedOn>(0);
     private Set<QuestionsCreated> questionsCreateds = new HashSet<QuestionsCreated>(0);
     private Set<Sectiontypes> sectiontypeses = new HashSet<Sectiontypes>(0);

    public Section() {
    }

	
    public Section(int sectionId, Module module, byte sectionIndex, String title) {
        this.sectionId = sectionId;
        this.module = module;
        this.sectionIndex = sectionIndex;
        this.title = title;
    }
    public Section(int sectionId, Module module, byte sectionIndex, String title, Set<ExaminedOn> examinedOns, Set<QuestionsCreated> questionsCreateds, Set<Sectiontypes> sectiontypeses) {
       this.sectionId = sectionId;
       this.module = module;
       this.sectionIndex = sectionIndex;
       this.title = title;
       this.examinedOns = examinedOns;
       this.questionsCreateds = questionsCreateds;
       this.sectiontypeses = sectiontypeses;
    }
   
     @Id 

    
    @Column(name="section_id", unique=true, nullable=false)
    public int getSectionId() {
        return this.sectionId;
    }
    
    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="module_id", nullable=false)
    public Module getModule() {
        return this.module;
    }
    
    public void setModule(Module module) {
        this.module = module;
    }

    
    @Column(name="section_index", nullable=false)
    public byte getSectionIndex() {
        return this.sectionIndex;
    }
    
    public void setSectionIndex(byte sectionIndex) {
        this.sectionIndex = sectionIndex;
    }

    
    @Column(name="title", nullable=false)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="section")
    public Set<ExaminedOn> getExaminedOns() {
        return this.examinedOns;
    }
    
    public void setExaminedOns(Set<ExaminedOn> examinedOns) {
        this.examinedOns = examinedOns;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="section")
    public Set<QuestionsCreated> getQuestionsCreateds() {
        return this.questionsCreateds;
    }
    
    public void setQuestionsCreateds(Set<QuestionsCreated> questionsCreateds) {
        this.questionsCreateds = questionsCreateds;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="section")
    public Set<Sectiontypes> getSectiontypeses() {
        return this.sectiontypeses;
    }
    
    public void setSectiontypeses(Set<Sectiontypes> sectiontypeses) {
        this.sectiontypeses = sectiontypeses;
    }




}


