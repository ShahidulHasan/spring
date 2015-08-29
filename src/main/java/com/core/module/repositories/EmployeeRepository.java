package com.core.module.repositories;

import java.util.List;

import com.core.module.entities.Employee;

public interface EmployeeRepository {
	public int insertRow(Employee employee);

	public List<Employee> getList();

	public Employee getRowById(int id);

	public int updateRow(Employee employee);

	public int deleteRow(int id);

}
