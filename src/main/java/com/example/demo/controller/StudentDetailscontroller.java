package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentDetails;
import com.example.demo.service.StudentDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@RestController
public class StudentDetailscontroller{
    @Autowired StudentDetailsService ser;
@PostMapping("/postt1")
public StudentDetails dopost(@RequestBody StudentDetails stu){
    return ser.postdata(stu);


}

}