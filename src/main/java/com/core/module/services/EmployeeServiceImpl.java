package com.core.module.services;

import java.util.List;

import com.core.module.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import com.core.module.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public int insertRow(Employee employee) {
		return employeeRepository.insertRow(employee);
	}

	@Override
	public List<Employee> getList() {
		return employeeRepository.getList();
	}

	@Override
	public Employee getRowById(int id) {
		return employeeRepository.getRowById(id);
	}

	@Override
	public int updateRow(Employee employee) {
		return employeeRepository.updateRow(employee);
	}

	@Override
	public int deleteRow(int id) {
		return employeeRepository.deleteRow(id);
	}

}
