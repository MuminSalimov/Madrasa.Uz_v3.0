package entity;
// Generated 02.04.2016 23:34:41 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Addmaterialandtypesmapping generated by hbm2java
 */
@Entity
@Table(name="addmaterialandtypesmapping"
    ,catalog="openeduuz"
)
public class Addmaterialandtypesmapping  implements java.io.Serializable {


     private AddmaterialandtypesmappingId id;
     private Addmaterialtypes addmaterialtypes;
     private Lectonaddmaterials lectonaddmaterials;

    public Addmaterialandtypesmapping() {
    }

	
    public Addmaterialandtypesmapping(AddmaterialandtypesmappingId id, Lectonaddmaterials lectonaddmaterials) {
        this.id = id;
        this.lectonaddmaterials = lectonaddmaterials;
    }
    public Addmaterialandtypesmapping(AddmaterialandtypesmappingId id, Addmaterialtypes addmaterialtypes, Lectonaddmaterials lectonaddmaterials) {
       this.id = id;
       this.addmaterialtypes = addmaterialtypes;
       this.lectonaddmaterials = lectonaddmaterials;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="mappingId", column=@Column(name="mappingID", nullable=false) ), 
        @AttributeOverride(name="lectonAddMaterialsAddMaterialId", column=@Column(name="lectonAddMaterials_addMaterialID", nullable=false) ) } )
    public AddmaterialandtypesmappingId getId() {
        return this.id;
    }
    
    public void setId(AddmaterialandtypesmappingId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="typeID")
    public Addmaterialtypes getAddmaterialtypes() {
        return this.addmaterialtypes;
    }
    
    public void setAddmaterialtypes(Addmaterialtypes addmaterialtypes) {
        this.addmaterialtypes = addmaterialtypes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="lectonAddMaterials_addMaterialID", nullable=false, insertable=false, updatable=false)
    public Lectonaddmaterials getLectonaddmaterials() {
        return this.lectonaddmaterials;
    }
    
    public void setLectonaddmaterials(Lectonaddmaterials lectonaddmaterials) {
        this.lectonaddmaterials = lectonaddmaterials;
    }




}


