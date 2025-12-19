package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.Validationservice;
import  com.example.demo.entity.ValidationEntity;
import  com.example.demo.repository.ValidationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.exception.ValidationException;


@Service
public class Validationserviceimpl implements Validationservice{
      @Autowired ValidationRepository student;
      @Override
 public ValidationEntity postdata(ValidationEntity validate){
    return student.save(validate);
 }
 @Override
public ValidationEntity finddData(int id){
    return student.findById(id);
}

 }