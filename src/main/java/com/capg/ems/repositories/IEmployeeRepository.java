package com.capg.ems.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.ems.entities.Employee;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Integer>{

	
	
}
