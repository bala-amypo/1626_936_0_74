package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.TimeStampService;
import  com.example.demo.entity.TimeStamp;
import  com.example.demo.repository.TimeStampRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TimeStampServiceImpl implements TimeStampService{
      @Autowired TimeStampRepository student;
      
      @Override
 public TimeStamp posttdata(TimeStamp stuuu){
    return student.save(stuuu);
 }
 @Override
    public List<TimeStamp>getAllDataa(){
      return student.findAll();
     }

 }