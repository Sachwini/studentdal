package com.avinash.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.avinash.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
