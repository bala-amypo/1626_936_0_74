package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.Validationservice;
import  com.example.demo.entity.Validationentity;
import  com.example.demo.repository.ValidationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class Validationserviceimpl implements Validationservice{
      @Autowired ValidationRepository student;
      
      @Override
 public Validationentity postdata(Validationentity validate){
    return student.save(validate);
 }

 }