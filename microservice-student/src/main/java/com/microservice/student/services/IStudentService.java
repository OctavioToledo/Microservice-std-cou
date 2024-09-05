package com.microservice.student.services;

import com.microservice.student.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    void deleteById(Long id);

    List<Student> findByCourseId(Long courseId);
}
