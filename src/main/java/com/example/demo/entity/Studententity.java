package com.example.demo.entity ;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Studententity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String password;
    private String email;
    private Date created;
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
       this.id=id;
    }
   public String getName(){
    return name;
   }
   public void setName(String name){
    this.name=name;
   }
    public String getPassword(){
    return password;
   }
   public void setPassword(String password){
    this.password=password;
   }
    public String getEmail(){
    return email;
   }
   public void setEmail(String email){
    this.email=email;
   }
    public Date getCreated(){
    return created;
   }
   public void setCreated(Date created){
    this.created=created;
   }
   public Studententity(Integer id, String name, String password , String email , Date created){
           this.id=id;
           this.name=name;
           this.password=password;
           this.email=email;
           this.created=created;
   }
   public Studententity(){
   }
}
