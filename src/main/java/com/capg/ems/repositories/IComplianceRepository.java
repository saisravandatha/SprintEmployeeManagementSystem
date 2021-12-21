package com.capg.ems.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.capg.ems.entities.Compliance;

@Repository
public interface IComplianceRepository extends CrudRepository<Compliance, Integer> {

}
