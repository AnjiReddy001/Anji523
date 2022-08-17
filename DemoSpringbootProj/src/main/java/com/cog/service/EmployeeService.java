package com.cog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cog.modal.Employee;

public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeRepository employeeRepo;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee emp=employeeRepo.save(employee);
		System.out.println(emp);
		return emp.getId();
	}

	@Override
	public List<Employee> getAllEmployees() {
	List<Employee> getAll=employeeRepo.findAll();
		return getAll;
	}

	@Override
	public Optional<Employee> getEmployee(Integer id) {
		return employeeRepo.findById(id);
	}

	@Override
	public void deleteEmployee(Integer id) {
		 employeeRepo.deleteById(id);
	}

	@Override
	public void deleteAllEmployee(Employee employee) {
		 employeeRepo.deleteAll();
		
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		Employee existEmployee=employeeRepo.findById(id).orElseThrow(
			() -> new ResourceNotFoundException("Employee", "id", id));
		existEmployee.setFirstName(employee.getFirstName());
		existEmployee.setLastName(employee.getLastName());
		existEmployee.setEmail(employee.getEmail());
		
		employeeRepo.save(existEmployee);
		return  existEmployee;
		}
	
	}

}
