package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.Validationentity;
import com.example.demo.service.Validationservice;
import jakarta.validation.Valid;


@RestController
public class Validationcontroller{
    @Autowired Validationservice val;
@PostMapping("/postt")
public Validationentity dopost(@Valid @RequestBody Validationentity validate){
    return val.postdata(stu);


}

}