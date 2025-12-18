package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.Studentservice;
import  com.example.demo.entity.Studententity;
import  com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
 @Override
    public List<Studententity>getAllData(){
      return student.findAll();
     }
@Override
     public String DeleteData( int id){
          student.deleteById(id);
          return "Deleted Sucessfully";
     }
     
}