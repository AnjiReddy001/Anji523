package com.cog.service;

import java.util.List;
import java.util.Optional;

import com.cog.modal.Employee;

public interface IEmployeeService {
	Integer saveEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	Optional<Employee> getEmployee(Integer id);
	public void deleteEmployee(Integer id);
	public void deleteAllEmployee(Employee employee);
	Employee updateEmployee(Employee employee, Integer id);

}
