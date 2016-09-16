package entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user"
    ,catalog="openeduuz"
)
public class User  implements java.io.Serializable {

    public User(String email, String userName, String password, String passwordHint, String userSurname, String userMiddlename) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.passwordHint = passwordHint;
        this.userSurname = userSurname;
        this.userMiddlename = userMiddlename;
    }


     private String email;
     private String userName;
     private String password;
     private String passwordHint;
     private String userSurname;
     private String userMiddlename;
     private Set userlearningcourseses = new HashSet(0);
     private Set usersandrolesmappings = new HashSet(0);

    public User() {
    }

	
    public User(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    public User(String email, String userName, String password, String passwordHint, String userSurname, String userMiddlename, Set userlearningcourseses, Set usersandrolesmappings) {
       this.email = email;
       this.userName = userName;
       this.password = password;
       this.passwordHint = passwordHint;
       this.userSurname = userSurname;
       this.userMiddlename = userMiddlename;
       this.userlearningcourseses = userlearningcourseses;
       this.usersandrolesmappings = usersandrolesmappings;
    }
   
     @Id 

    
    @Column(name="email", unique=true, nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="userName", nullable=false, length=20)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="password", nullable=false, length=30)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="passwordHint")
    public String getPasswordHint() {
        return this.passwordHint;
    }
    
    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    
    @Column(name="userSurname", length=20)
    public String getUserSurname() {
        return this.userSurname;
    }
    
    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    
    @Column(name="userMiddlename", length=20)
    public String getUserMiddlename() {
        return this.userMiddlename;
    }
    
    public void setUserMiddlename(String userMiddlename) {
        this.userMiddlename = userMiddlename;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set getUserlearningcourseses() {
        return this.userlearningcourseses;
    }
    
    public void setUserlearningcourseses(Set userlearningcourseses) {
        this.userlearningcourseses = userlearningcourseses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set getUsersandrolesmappings() {
        return this.usersandrolesmappings;
    }
    
    public void setUsersandrolesmappings(Set usersandrolesmappings) {
        this.usersandrolesmappings = usersandrolesmappings;
    }
}


