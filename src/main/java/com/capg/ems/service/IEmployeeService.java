package com.capg.ems.service;

import java.util.List;

import com.capg.ems.dto.EmployeeDTO;
import com.capg.ems.exceptions.EmployeeNotFoundException;

public interface IEmployeeService {

	public EmployeeDTO addEmloyee(EmployeeDTO emp);

	public void deleteEmployee(int userId) throws EmployeeNotFoundException;

	public EmployeeDTO updateEmployee(EmployeeDTO emp);

	public List<EmployeeDTO> getAllEmployees();

	public EmployeeDTO getEmployeeById(int userid) throws EmployeeNotFoundException;

	public long getEmployeeCount();

}
