package springAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Column(name = "name")
    private String name;

    
    @Column(unique = true)
    private String email;

   
    private String gender;

  
    private String password;

 // Setter for id
    
    public String getname() {
        return name;
    }
    
    public void setname(String name) {
        this.name = name;
    }
    

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getgender() {
        return gender;
    }

    // Setter for id
    public void setgender(String gender) {
        this.gender = gender;
    }
    
    
    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

}
