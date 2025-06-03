package edu.icet.ecom.controller;


import edu.icet.ecom.model.Student;
import edu.icet.ecom.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/save-student")
    Student saveStudent(@RequestBody Student student){
        System.out.println(student);
        service.insertToDB(student);

        return student;
    }

}
