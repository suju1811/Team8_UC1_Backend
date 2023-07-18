package com.studentinfo.springserver.repo;

import com.studentinfo.springserver.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {
    //String saveAll(List<Student> data);
}

