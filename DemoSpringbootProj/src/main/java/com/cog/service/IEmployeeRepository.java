package com.cog.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cog.modal.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
