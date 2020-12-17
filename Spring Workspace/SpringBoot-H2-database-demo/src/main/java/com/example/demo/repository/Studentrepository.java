package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer> {
		@Query("select u from Student u where email=?1 AND password=?2")
		public Student findEmail(String userId,String password);
		Optional<Student> findByEmail(String emailname);
	
}
