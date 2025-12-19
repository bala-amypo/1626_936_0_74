package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationSservice;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import java.util.List;
import jakarta.validation.Valid;

@RestController
public class Validationcontroller{
    @Autowired ValidationService ser;
@PostMapping("/postt")
public ValidationEntity dopost( @Valid @RequestBody ValidationEntity stuu){
    return ser.postdata(stuu);

}
@GetMapping("/getidd{id}")
public ValidationEntity getdataid(@Valid @PathVariable Long id){
    return ser.findDataa(id);
}

}
