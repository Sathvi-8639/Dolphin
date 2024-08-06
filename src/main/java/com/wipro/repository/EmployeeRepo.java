package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bean.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
