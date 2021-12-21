package com.capg.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ems.entities.Department;
import com.capg.ems.service.DepartmentServiceimpl;

@RestController
@RequestMapping(value = "department")
@CrossOrigin("http://localhost:4200")
public class DepartmentController {
	@Autowired
	private DepartmentServiceimpl service;

	// inserting department into department table
	@PostMapping(path = "/add")
	public ResponseEntity<Boolean> addDepartment(@RequestBody Department dName) {
		service.addDepartment(dName);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}

	//deleting department by id from the department table
	@DeleteMapping("/department/{id}")
	public void deleteDepartmentByID(@PathVariable int id) {
		service.deleteDepartmentByID(id);
	}

	//getting all the departments from the department table
	@GetMapping(path = "/getAll")
	public ResponseEntity<List<Department>> getAllDepartments() {
		List<Department> list = service.getAllDepartments();

		return new ResponseEntity<List<Department>>(list, new HttpHeaders(), HttpStatus.OK);

	}

	//Getting department by Id from the department table
	@GetMapping("/department/{id}")
	public Optional<Department> getDepartmentById(@PathVariable int id) {
		return service.getDepartmentById(id);
	}

	//Getting the count of department from the department table
	@GetMapping("/count")
	public long counts() {
		return service.counts();
	}

}
