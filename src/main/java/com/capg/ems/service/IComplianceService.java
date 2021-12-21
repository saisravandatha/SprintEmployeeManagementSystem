package com.capg.ems.service;

import java.util.List;

import com.capg.ems.dto.ComplianceDTO;
import com.capg.ems.exceptions.ComplianceNotFoundException;

public interface IComplianceService {
	
	public ComplianceDTO addCompliance(ComplianceDTO com);
	public List<ComplianceDTO> getAllCompliances();
	public List<ComplianceDTO> getAllCompliance(int userId) throws ComplianceNotFoundException;
	ComplianceDTO updateCompliance(ComplianceDTO compliance) throws ComplianceNotFoundException;
}
