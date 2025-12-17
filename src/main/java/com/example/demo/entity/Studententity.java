package com.example.demo.entity
import java.sql.Date
import jakarta.persistence.Entityimport jakarta.persistence.id

@Entity


public class Studententity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String passowrd;
    private String created;
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

    
}