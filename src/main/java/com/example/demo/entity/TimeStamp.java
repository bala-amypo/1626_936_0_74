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
import java.time.LocalDateTime;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class TimeStamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String Email;
    private LocalDateTime CreateAt;
    private LocalDateTime UpdateAt;
    @PrePersist
   
    protected void Oncreate(){
    LocalDateTime now= LocalDateTime().now();
    this.CreateAt=now;
    this.UpdateAt=now;
    }
    @PreUpdate
    protected void Onupdate(){
        this.UpdateAt=now;
    }

}