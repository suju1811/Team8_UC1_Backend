package com.studentinfo.springserver.controller;

import com.studentinfo.springserver.model.student.Student;
import com.studentinfo.springserver.model.student.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentDao studentDao;
    @Autowired
    @GetMapping("/get-all")
    public List<Student> getAllStudents(){
        return studentDao.getAllStudent();
    }
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentDao.save(student);
    }

    @GetMapping
    public Student getStudentById(
            @RequestParam(name = "id") int id
    ){
        Optional<Student> student =  studentDao.getStudentById(id);
        if(student.isPresent()){
            // HTTPSTATUS 200
            return student.get();
        }
        else{
            // HTTPSTATUS 400 => not found
            return null;
        }
    }

}
