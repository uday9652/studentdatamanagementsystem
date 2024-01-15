package com.sathya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
