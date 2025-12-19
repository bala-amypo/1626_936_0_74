package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.TimeStamp;
import com.example.demo.service.TimeStampService;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@RestController
public class TimeStampController{
    @Autowired TimeStampService ser;
@PostMapping("/posttt")
public TimeStamp dopost(@RequestBody TimeStamp stuuu){
    return ser.posttdata(stuuu);


}
@GetMapping("/gettt")
public List<TimeStamp>getvalue(){
    return ser.getAllDataa();
}
}