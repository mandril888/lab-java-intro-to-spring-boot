package com.gets.repository;

import com.gets.Enums.Status;
import com.gets.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee, Integer> {
    Optional<Employee> findById(int id);
    List<Employee> findByStatus(Status status);
    List<Employee> findByDepartment(String department);
}

