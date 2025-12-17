package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.Studentservice;
import  com.example.demo.service.Studententity;
import  com.example.demo.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Studentserviceimpl implements Studentservice{
      @Autowired StudentRepository student;
      //save()
      //findall()
      //findById()
      //deleteById()
      //existsById()
      @Override
 public Studententity postdata(Studententity stu){
    return student.save(stu);

  


 }
}