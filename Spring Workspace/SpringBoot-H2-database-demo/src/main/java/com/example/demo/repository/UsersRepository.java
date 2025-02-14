package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
@Repository
public interface UsersRepository extends JpaRepository<Student, Long>{
    Student findByEmail(String email);
    
}
