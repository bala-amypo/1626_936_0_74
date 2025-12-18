package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;



@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 @NotNull
 @Size(min=2,max=10,msg="must be 2 to 10 character")
 private String username;
 @Email(msg="Email is not Valid")
 private String email;
 @Size(min=2,max=10,msg="must")
 @NotNull(msg="Password is mandatory")
 private Sring password;
 @Positive
 @Max(30)
 NotNull
 private int age;

}