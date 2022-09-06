package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Get CRUD methods
// JPARepository automatically add @Repository and @Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
