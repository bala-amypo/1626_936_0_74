package com.example.demo.Entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Studententity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String passowrd;
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
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.passowrd=password;
}
public String getDate(){
    return date;
}
public void setDate(Date created){
    this.created=created;
}
public Studententity(){

}
public Studententity(Integer id,String name, String email,String passowrd,Date created){
this.id=id;
this.name=name;
this.email=email;
this.passowrd=password;
this.created=created;

}
    
}