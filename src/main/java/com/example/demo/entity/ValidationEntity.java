package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;




@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 @NotNull
 @Size(min=2,max=10,message="must be 2 to 10 character")
 private String username;
 @Email(message="Email is not Valid")
 private String email;
 @Size(min=2,max=10,message="must be 2 to 10 character")
 @NotNull(message="Password is mandatory")
 private String password;
 @Positive(message="Age must be positive")
 @Max(30)
 @NotNull
 private int age;
//  public Long getId(){
//         return id;
//     }
//     public void setId(Long id){
//        this.id=id;
//     }
//    public String getName(){
//     return username;
//    }
//    public void setName(String username){
//     this.username=username;
//    }
//     public String getPassword(){
//     return password;
//    }
//    public void setPassword(String password){
//     this.password=password;
//    }
//     public String getEmail(){
//     return email;
//    }
//    public void setEmail(String email){
//     this.email=email;
//    }
//     public int getAge(){
//     return age;
//    }
//    public void setAge(int age){
//     this.age=age;
//    }
//    public ValidationEntity(Long id,
//    @NotNull @Size(min=2,max=10,message="must be 2 to 10 character") String username,
//    @Size(min=2,max=10,message="must be 2 to 10 character")@NotNull(message="Password is mandatory") String password ,
//    @Email(message="Email is not Valid")String email , 
//    @Positive(message="Age must be positive") @Max(30) @NotNull int age){
//            this.id=id;
//            this.username=username;
//            this.password=password;
//            this.email=email;
//            this.age=age;
//    }
//    public ValidationEntity(){
//    }
}

