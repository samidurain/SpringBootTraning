package com.boa.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.training.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
