package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Validationentity;
@Repository
public interface ValidationRepository extends JpaRepository<Validationentity,Long>{
    

}