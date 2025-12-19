package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import  com.example.demo.entity.ValidationEntity;
import  com.example.demo.repository.ValidationRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import java.util.List;
import com.example.demo.exception.ValidationException;

@Service
public class Validationserviceimpl implements ValidationService{
      @Autowired ValidationRepository student;
      //save()
      //findall()
      //findById()
      //deleteById()
      //existsById()
 @Override
 public ValidationEntity postdata(ValidationEntity stuu){
    return student.save(stuu);
 }
 @Override
  public ValidationEntity findDataa(Long id){
      return student.findById(id).orElseThrow(()->new ValidationException("Invalid id"+id));
     }
}




