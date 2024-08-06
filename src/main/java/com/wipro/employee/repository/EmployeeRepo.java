package com.wipro.employee.repository;

import com.wipro.employee.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
