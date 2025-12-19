package com.example.demo.service;
import com.example.demo.entity.ValidationEntity;

public interface Validationservice{
    ValidationEntity postdata(ValidationEntity validate);
    ValidationEntity finddData(int id);
   
}
