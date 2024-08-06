package com.wipro.employee.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.employee.bean.Employee;
import com.wipro.employee.repo.EmployeeRepo;

@RestController
public class MyRestController {
	
	@Autowired
	EmployeeRepo repo;
	
	@GetMapping(path="/Employees")
	public List<Employee> allEmployees(){
		ArrayList<Employee> list=new ArrayList<Employee>();
		Iterator<Employee> it=repo.findAll().iterator();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	@GetMapping(path="/Employee/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return repo.findById(id).get();
	}
	
	@PostMapping(path="/createEmployees")
	public void insertEmployees(@RequestBody Employee emp) {
		repo.save(emp);
	}
	
}
