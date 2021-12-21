package com.capg.ems.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.capg.ems.dto.ComplianceDTO;
import com.capg.ems.entities.Compliance;
import com.capg.ems.service.IComplianceServiceImpl;

@RestController
public class ComplianceController {

	@Autowired
	IComplianceServiceImpl complianceService;

	// displaying list of all complainces
	@GetMapping("/compliances")
	public List<ComplianceDTO> getAllCompliance() {
		return complianceService.getAllCompliances();
	}

	// displaying compliance by id
	@GetMapping("/compliances/{id}")
	public Optional<Compliance> getCompliance(@PathVariable int id) {
		return complianceService.getComplianceById(id);
	}

	// inserting compliance
	@PostMapping("/compliances")
	public @ResponseBody String addCompliances(@RequestBody @Valid ComplianceDTO compliance) {
		complianceService.addCompliance(compliance);
		return "Compliance Added Successfully";
	}

	// Updating Compliant
	@PutMapping("/updateCompliance")
	public String updateCompliance(@RequestBody ComplianceDTO compliance) {
		complianceService.updateCompliance(compliance);
		return "compliance updated successfully";
	}
}
