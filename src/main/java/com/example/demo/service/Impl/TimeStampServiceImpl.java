package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.Studentservice;
import  com.example.demo.entity.Studententity;
import  com.example.demo.repository.TimeSRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TimeStampServiceImpl implements TimeStampService{
      @Autowired TimeStampRepository student;
      
      @Override
 public TimeStamp postdata(TimeStamp stuuu){
    return student.save(stuuu);
 }
 @Override
    public List<TimeStamp>getAllData(){
      return student.findAll();
     }

 }