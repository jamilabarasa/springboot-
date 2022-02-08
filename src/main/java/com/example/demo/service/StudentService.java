package com.example.demo.service;

import com.example.demo.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    private final Logger log = LoggerFactory.getLogger(StudentService.class);
    private final List<Student> students = new ArrayList<>();

    //save
    //input => student
    //process => add student to a list
    //output => student

    public Student save(Student student) {

        students.add(student);

        return student;


    }




    //edit
    //input => student email
    //process => update student in a list
    //loop through email,get student with the same email,update
    //output=> updated student

    public Student update(Student student) {

        // student email

        int index = -1;
        for (Student student1 : students) {
            if (student1.getEmail().equals(student.getEmail())) {
                index = students.indexOf(student1);
            }
        }

        if (index >= 0) {
            // update the student
            students.set(index,student);
        }

        return student;
    }


    //get one

    public Student getOne(String  email){


        for (Student student1 : students) {
            if (student1.getEmail().equals(email)) {

                return student1;
            }

        }

        return null;


    }



    //get all
    public List<Student> getAll() {
        return students;
    }
}
