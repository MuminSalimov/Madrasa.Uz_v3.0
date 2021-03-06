package entity;
// Generated 02.04.2016 23:34:41 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Courselections generated by hbm2java
 */
@Entity
@Table(name="courselections"
    ,catalog="openeduuz"
)
public class Courselections  implements java.io.Serializable {


     private Integer lectionId;
     private Courses courses;
     private int lectionNumber;
     private String lectionNameRu;
     private String lectionNameUz;
     private String lectionNameEn;
     private String lectionDescriptionRu;
     private String lectionDescriptionUz;
     private String lectionDescriptionEn;
     private Boolean isActive;
     private Set lectionmainmaterialses = new HashSet(0);
     private Set lectonaddmaterialses = new HashSet(0);
     private Set userlearningcourseses = new HashSet(0);
     private Set lectionquestionses = new HashSet(0);

    public Courselections() {
    }

	
    public Courselections(Courses courses, int lectionNumber, String lectionNameRu, String lectionDescriptionRu) {
        this.courses = courses;
        this.lectionNumber = lectionNumber;
        this.lectionNameRu = lectionNameRu;
        this.lectionDescriptionRu = lectionDescriptionRu;
    }
    public Courselections(Courses courses, int lectionNumber, String lectionNameRu, String lectionNameUz, String lectionNameEn, String lectionDescriptionRu, String lectionDescriptionUz, String lectionDescriptionEn, Boolean isActive, Set lectionmainmaterialses, Set lectonaddmaterialses, Set userlearningcourseses, Set lectionquestionses) {
       this.courses = courses;
       this.lectionNumber = lectionNumber;
       this.lectionNameRu = lectionNameRu;
       this.lectionNameUz = lectionNameUz;
       this.lectionNameEn = lectionNameEn;
       this.lectionDescriptionRu = lectionDescriptionRu;
       this.lectionDescriptionUz = lectionDescriptionUz;
       this.lectionDescriptionEn = lectionDescriptionEn;
       this.isActive = isActive;
       this.lectionmainmaterialses = lectionmainmaterialses;
       this.lectonaddmaterialses = lectonaddmaterialses;
       this.userlearningcourseses = userlearningcourseses;
       this.lectionquestionses = lectionquestionses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="lectionID", unique=true, nullable=false)
    public Integer getLectionId() {
        return this.lectionId;
    }
    
    public void setLectionId(Integer lectionId) {
        this.lectionId = lectionId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="courseID", nullable=false)
    public Courses getCourses() {
        return this.courses;
    }
    
    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    
    @Column(name="lectionNumber", nullable=false)
    public int getLectionNumber() {
        return this.lectionNumber;
    }
    
    public void setLectionNumber(int lectionNumber) {
        this.lectionNumber = lectionNumber;
    }

    
    @Column(name="lectionNameRU", nullable=false)
    public String getLectionNameRu() {
        return this.lectionNameRu;
    }
    
    public void setLectionNameRu(String lectionNameRu) {
        this.lectionNameRu = lectionNameRu;
    }

    
    @Column(name="lectionNameUZ")
    public String getLectionNameUz() {
        return this.lectionNameUz;
    }
    
    public void setLectionNameUz(String lectionNameUz) {
        this.lectionNameUz = lectionNameUz;
    }

    
    @Column(name="lectionNameEN")
    public String getLectionNameEn() {
        return this.lectionNameEn;
    }
    
    public void setLectionNameEn(String lectionNameEn) {
        this.lectionNameEn = lectionNameEn;
    }

    
    @Column(name="lectionDescriptionRU", nullable=false)
    public String getLectionDescriptionRu() {
        return this.lectionDescriptionRu;
    }
    
    public void setLectionDescriptionRu(String lectionDescriptionRu) {
        this.lectionDescriptionRu = lectionDescriptionRu;
    }

    
    @Column(name="lectionDescriptionUZ")
    public String getLectionDescriptionUz() {
        return this.lectionDescriptionUz;
    }
    
    public void setLectionDescriptionUz(String lectionDescriptionUz) {
        this.lectionDescriptionUz = lectionDescriptionUz;
    }

    
    @Column(name="lectionDescriptionEN")
    public String getLectionDescriptionEn() {
        return this.lectionDescriptionEn;
    }
    
    public void setLectionDescriptionEn(String lectionDescriptionEn) {
        this.lectionDescriptionEn = lectionDescriptionEn;
    }

    
    @Column(name="isActive")
    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="courselections")
    public Set getLectionmainmaterialses() {
        return this.lectionmainmaterialses;
    }
    
    public void setLectionmainmaterialses(Set lectionmainmaterialses) {
        this.lectionmainmaterialses = lectionmainmaterialses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="courselections")
    public Set getLectonaddmaterialses() {
        return this.lectonaddmaterialses;
    }
    
    public void setLectonaddmaterialses(Set lectonaddmaterialses) {
        this.lectonaddmaterialses = lectonaddmaterialses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="courselections")
    public Set getUserlearningcourseses() {
        return this.userlearningcourseses;
    }
    
    public void setUserlearningcourseses(Set userlearningcourseses) {
        this.userlearningcourseses = userlearningcourseses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="courselections")
    public Set getLectionquestionses() {
        return this.lectionquestionses;
    }
    
    public void setLectionquestionses(Set lectionquestionses) {
        this.lectionquestionses = lectionquestionses;
    }




}


