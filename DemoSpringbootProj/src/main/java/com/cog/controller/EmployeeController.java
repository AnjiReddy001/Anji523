package com.cog.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cog.modal.Employee;
import com.cog.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@PostMapping
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer id){
		Optional<Employee> employee=employeeService.getEmployee(id);
		return employee;
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable Integer id){
		System.out.println(id);
		ResponseEntity<Employee> responseEntity=new ResponseEntity<>(HttpStatus.OK);
		try {
			employeeService.deleteEmployee(id);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity=new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		return responseEntity;
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Integer id, @RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}
	
}
