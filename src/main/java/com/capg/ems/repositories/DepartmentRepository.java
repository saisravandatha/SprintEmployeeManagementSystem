package com.capg.ems.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capg.ems.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}