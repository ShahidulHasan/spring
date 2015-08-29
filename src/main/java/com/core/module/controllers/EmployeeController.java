package com.core.module.controllers;

import java.util.List;

import com.core.module.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.core.module.entities.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("form")
	public ModelAndView getForm(@ModelAttribute Employee employee) {
		return new ModelAndView("employee/form");
	}
	
	@RequestMapping("register")
	public ModelAndView registerUser(@ModelAttribute Employee employee) {
		employeeService.insertRow(employee);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping("list")
	public ModelAndView getList() {
		List employeeList = employeeService.getList();
		return new ModelAndView("employee/list","employeeList",employeeList);
	}
	
	@RequestMapping("delete")
	public ModelAndView deleteUser(@RequestParam int id) {
		employeeService.deleteRow(id);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping("edit")
	public ModelAndView editUser(@RequestParam int id,@ModelAttribute Employee employee) {
		Employee employeeObject = employeeService.getRowById(id);
		return new ModelAndView("employee/edit","employeeObject",employeeObject);
	}
	
	@RequestMapping("update")
	public ModelAndView updateUser(@ModelAttribute Employee employee) {
		employeeService.updateRow(employee);
		return new ModelAndView("redirect:list");
	}

}
