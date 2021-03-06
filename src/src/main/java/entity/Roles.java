package entity;
// Generated 02.04.2016 23:34:41 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Roles generated by hbm2java
 */
@Entity
@Table(name="roles"
    ,catalog="openeduuz"
)
public class Roles  implements java.io.Serializable {


     private int roleId;
     private String roleName;
     private Set usersandrolesmappings = new HashSet(0);

    public Roles() {
    }

	
    public Roles(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }
    public Roles(int roleId, String roleName, Set usersandrolesmappings) {
       this.roleId = roleId;
       this.roleName = roleName;
       this.usersandrolesmappings = usersandrolesmappings;
    }
   
     @Id 

    
    @Column(name="roleID", unique=true, nullable=false)
    public int getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    
    @Column(name="roleName", nullable=false, length=45)
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="roles")
    public Set getUsersandrolesmappings() {
        return this.usersandrolesmappings;
    }
    
    public void setUsersandrolesmappings(Set usersandrolesmappings) {
        this.usersandrolesmappings = usersandrolesmappings;
    }




}


