package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.Studententity;
import com.example.demo.entity.Studentservice;


@RestController
public class Studentcontroller{
    @Autowired Studentservice ser;//if we use studentimplementation the logic will be visible to the user
@PostMapping("/post")
public Studententity dopost(@RequestBody Studententity stu){
    return.ser.postdata(stu);


}
}