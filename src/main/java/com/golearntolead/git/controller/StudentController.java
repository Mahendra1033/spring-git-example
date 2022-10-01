package com.golearntolead.git.controller;

import com.golearntolead.git.entity.Student;
import com.golearntolead.git.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getAllStudentDetails();
    }

    @GetMapping("getStudentById/{id}")
    public Student getStudentById(@PathVariable("id") long id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        return studentService.deleteById(id);
    }
}
