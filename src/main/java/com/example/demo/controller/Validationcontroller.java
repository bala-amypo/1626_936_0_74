package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.Validationservice;
import jakarta.validation.Valid;


@RestController
public class Validationcontroller{
    @Autowired Validationservice val;
@PostMapping("/postt")
public ValidationEntity dopost(@Valid @RequestBody ValidationEntity validate){
    return val.postdata(val);


}

}