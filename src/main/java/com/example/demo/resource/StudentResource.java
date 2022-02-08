package com.example.demo.resource;

import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentResource {

    private final Logger logger = LoggerFactory.getLogger(StudentResource.class);

    @Autowired
    private StudentService studentService;


    @PostMapping("/students")
    public Student save(@RequestBody Student student) {

        logger.debug("Saving student");

        return studentService.save(student);


    }

    @GetMapping("/students")
    public List<Student> getAll(){

        logger.debug("getting all students");

        return studentService.getAll();

    }

    @GetMapping("/students/{email}")
    public Student getOne(@PathVariable String email){

        logger.debug("getting one student");

        return studentService.getOne(email);
    }

    @PutMapping("/students")
    public Student update(@RequestBody Student student) {

        logger.debug("updating student");

        return studentService.update(student);
        
    }




}
