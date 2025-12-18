package com.example.demo.service;
import com.example.demo.entity.Studententity;
import java.util.List;
public interface Studentservice{
    Studententity postdata(Studententity stu);
    List<Studententity>getAllData();
    String DeleteData(int id);
    Studententity findData(int id);
    Stdententity UpdateData(int id,Studententity entity);
}
