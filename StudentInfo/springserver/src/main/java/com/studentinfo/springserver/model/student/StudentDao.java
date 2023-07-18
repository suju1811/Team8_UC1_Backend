package com.studentinfo.springserver.model.student;

import com.studentinfo.springserver.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;


@Service
public class StudentDao {
    @Autowired
    private StudentRepo repository;
    public Student save(Student student){
      return repository.save(student);
    }
    public void delete(int studentId){
        repository.deleteById(studentId);
    }
    public List<Student> getAllStudent(){
        List<Student> students = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(student ->{
           students.add(student);
        });
        return students;
    }
    public Optional<Student> getStudentById(int studentId){
        Optional<Student> student =  repository.findById(studentId);
        return student.isPresent() ? student : Optional.empty();
    }
}