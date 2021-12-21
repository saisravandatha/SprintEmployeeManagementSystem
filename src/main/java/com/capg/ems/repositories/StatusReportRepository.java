package com.capg.ems.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.ems.entities.StatusReport;

@Repository
public interface StatusReportRepository extends CrudRepository<StatusReport, Integer> {

}